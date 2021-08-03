package rba.tool.core.z3;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;

import com.microsoft.z3.ApplyResult;
import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import com.microsoft.z3.Goal;
import com.microsoft.z3.Solver;
import com.microsoft.z3.Status;
import com.microsoft.z3.Tactic;

import groovy.util.GroovyScriptEngine;
import rba.tool.core.Activator;
import rba.tool.core.constraint.IConstraintCalculation;
import rba.tool.core.sort.ISortValueCalculation;

public class Z3CodeManager {

    public static Z3CodeManager INSTNACE = new Z3CodeManager();

    private static final String ERROR_ENV_PATH = "The Z3 storage path cannot be found. Area and content parameters are not derived correctly. \r\nSet the environment variable of the storage path of Z3.";

    private static final String ERROR_SCRIPT = "Z3 execution failed. There is an error in the script.";

    private static final String SORT_SCRIPT_NAME = "SortValueCalculation.java";

    private static final String CONST_SCRIPT_NAME = "ConstraintCalculation.java";

    private static final String ERROR_NOT_FOUND_SCRIPT = "Z3 execution failed. Failed to generate %s in the %s project.";

    private Z3CodeManager() {
    }

    public boolean loadZ3Lib() {
        String z3Path = "";
        try {
            z3Path = getPath();
        } catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
        if (null == z3Path || z3Path.isEmpty()) {
            return false;
        }
        try {
            // load necessary z3 DLLs
            loadDLLs(z3Path);
            // add z3 path to java.library.path
            addLibraryPath(z3Path);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private String getPath() throws IOException {
        String path = "";
        String jvmBitMode = System.getProperty("sun.arch.data.model");
        // Check JVM 32 Bit.
        if (jvmBitMode != null && jvmBitMode.contains("32")) {
            URL bundleEntryUrl = Platform.getBundle(Activator.PLUGIN_ID).getEntry("lib32/z3");
            URL fileUrl = FileLocator.toFileURL(bundleEntryUrl);
            path = fileUrl.getPath();
        }
        // Check JVM 64 Bit.
        if (jvmBitMode != null && jvmBitMode.contains("64")) {
            URL bundleEntryUrl = Platform.getBundle(Activator.PLUGIN_ID).getEntry("lib/z3");
            URL fileUrl = FileLocator.toFileURL(bundleEntryUrl);
            path = fileUrl.getPath();
        }
        return path;
    }

    public ISortValueCalculation getSortCaluculator(IProject project) throws RuntimeException {

        if (!loadZ3Lib()) {
            String errMsg = ERROR_ENV_PATH;
            throw new RuntimeException(errMsg);
        }

        ISortValueCalculation calc = null;
        IFile file = findFile(SORT_SCRIPT_NAME, project);
        if (file != null) {
            try {
                String fileName = file.getName();
                String className = fileName.substring(0, fileName.lastIndexOf("."));

                String string = file.getLocation().toString();
                String genPath = string.substring(0, string.length() - fileName.length());

                GroovyScriptEngine e = new GroovyScriptEngine(new String[] { genPath }, getClass().getClassLoader());
                e.loadScriptByName(fileName);
                Class<?> s = e.getGroovyClassLoader().loadClass(className);

                calc = (ISortValueCalculation) s.newInstance();
            } catch (Exception e) {
                String errMsg = ERROR_SCRIPT;
                throw new RuntimeException(errMsg);
            }

        } else {
            String errMsg = String.format(ERROR_NOT_FOUND_SCRIPT, project.getName(), SORT_SCRIPT_NAME);
            throw new RuntimeException(errMsg);
        }

        return calc;
    }

    public IFile findFile(String name, IContainer container) {
        try {
            IResource[] resources;
            resources = container.members();
            if (resources == null || resources.length == 0) {
                return null;
            }
            for (IResource resource : resources) {
                if (resource instanceof IFile && resource.getName().equals(name)) {
                    return (IFile) resource;
                }
                if (resource instanceof IContainer) {
                    IFile recursive = findFile(name, (IContainer) resource);
                    if (recursive != null) {
                        return recursive;
                    }
                }
            }
        } catch (CoreException e) {
        }

        return null;
    }

    /**
     * load z3 DLLs from the path
     * @param z3Path
     */
    private void loadDLLs(String z3Path) throws Exception {
        System.load(z3Path + "\\Microsoft.Z3.dll");
        System.load(z3Path + "\\msvcr110.dll");
        System.load(z3Path + "\\msvcp110.dll");
        System.load(z3Path + "\\vcomp110.dll");
        System.load(z3Path + "\\libz3.dll");
        System.load(z3Path + "\\libz3java.dll");
    }

    /**
     * add z3 path to java.library.path
     * @param pathToAdd
     */
    private void addLibraryPath(String pathToAdd) throws Exception {
        final Field usrPathsField = ClassLoader.class.getDeclaredField("usr_paths");
        usrPathsField.setAccessible(true);
        // get array of paths
        final String[] paths = (String[]) usrPathsField.get(null);
        // check if the path to add is already present
        for (String path : paths) {
            if (path.equals(pathToAdd)) {
                return;
            }
        }
        // add the new path
        final String[] newPaths = Arrays.copyOf(paths, paths.length + 1);
        newPaths[newPaths.length - 1] = pathToAdd;
        usrPathsField.set(null, newPaths);
    }

    public Map<String, Integer> setModel(Solver s, List<Expr> contentsList, Status st) {
        switch (st) {
        case UNKNOWN:
            System.out.println("Unknown");
            break;

        case SATISFIABLE:
            return setSat(s, contentsList);
        case UNSATISFIABLE:
            return setUnsat(s);
        }

        return null;
    }

    public Map<String, Integer> setSat(Solver s, List<Expr> evaluatedExpr) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put(Z3Constants.TOTAL_RESULT, Z3Constants.SAT_VAL);

        for (Expr i : evaluatedExpr) {
            String areaName = getName(i.getSExpr());
            String expVal = s.getModel().evaluate(i, false).toString();

            map.put(areaName, Integer.valueOf(expVal));
        }

        return map;
    }

    public Map<String, Integer> setUnsat(Solver s) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put(Z3Constants.TOTAL_RESULT, Z3Constants.UNSAT_VAL);

        for (Expr i : s.getUnsatCore()) {
            String areaName = getName(i.toString());
            map.put(areaName, Z3Constants.UNSAT_VAL);
        }
        return map;
    }

    private String getName(String baseName) {
        String name = baseName;
        if (name.length() > 2 && name.startsWith("|") && name.endsWith("|")) {
            name = name.substring(1, name.length() - 1);
        }

        return name;
    }

    public List<String> getErrors(Solver s, Status st) {
        List<String> list = new ArrayList<String>();

        switch (st) {
        case UNKNOWN:

            list.add(Z3Constants.UNKNOWN);
            list.add(s.getReasonUnknown());
            break;
        case SATISFIABLE:
            list.add(Z3Constants.SAT);
            break;
        case UNSATISFIABLE:
            list.add(Z3Constants.UNSAT);

            for (Expr i : s.getUnsatCore()) {
                list.add(getName(i.toString()));
            }
        }

        return list;
    }

    public List<String> getErrors(Context ctx, Solver s, Status st, String constrName, List<BoolExpr> constrList, List<BoolExpr> constrLabelList) {
        List<String> list = new ArrayList<String>();

        switch (st) {
        case UNKNOWN:
            String reason = s.getReasonUnknown();
            System.out.println("*Unknown:" + constrName + " - " + reason);

            Goal g = ctx.mkGoal(false, false, false);
            for (int i = 0; i < constrList.size(); i++) {
                g.add(constrList.get(i), constrLabelList.get(i));
            }

            Tactic t = ctx.mkTactic("qfbv");
            try {
                ApplyResult ar = t.apply(g);
                if (ar.getNumSubgoals() == 1) {
                    if (ar.getSubgoals()[0].isDecidedSat()) {
                        System.out.println("=> SAT");
                        list.add(Z3Constants.SAT);
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("2ND Check");

                t = ctx.mkTactic("smt");
                try {
                    ApplyResult ar = t.apply(g);
                    if (ar.getNumSubgoals() == 1) {
                        if (ar.getSubgoals()[0].isDecidedSat()) {
                            System.out.println("==> SAT");
                            list.add(Z3Constants.SAT);
                            break;
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

            list.add(Z3Constants.UNKNOWN);
            list.add(reason);
            break;
        case SATISFIABLE:
            list.add(Z3Constants.SAT);
            break;
        case UNSATISFIABLE:
            list.add(Z3Constants.UNSAT);

            for (Expr i : s.getUnsatCore()) {
                list.add(getName(i.toString()));
            }
        }

        return list;
    }

    public IConstraintCalculation getConstraintCaluculator(IProject project) throws RuntimeException {

        if (!loadZ3Lib()) {
            String errMsg = ERROR_ENV_PATH;
            throw new RuntimeException(errMsg);
        }

        IConstraintCalculation calc = null;
        IFile file = findFile(CONST_SCRIPT_NAME, project);
        if (file != null) {
            String fileName = file.getName();
            String className = fileName.substring(0, fileName.lastIndexOf("."));

            String string = file.getLocation().toString();
            String genPath = string.substring(0, string.length() - fileName.length());

            calc = getConstraintCaluculator(fileName, className, genPath);

        } else {
            String errMsg = String.format(ERROR_NOT_FOUND_SCRIPT, project.getName(), CONST_SCRIPT_NAME);
            throw new RuntimeException(errMsg);
        }

        return calc;
    }

    public IConstraintCalculation getConstraintCaluculator(String fileName, String className, String genPath) throws RuntimeException {
        IConstraintCalculation calc = null;
        try {
            GroovyScriptEngine e = new GroovyScriptEngine(new String[] { genPath }, getClass().getClassLoader());
            e.loadScriptByName(fileName);
            Class<?> s = e.getGroovyClassLoader().loadClass(className);

            calc = (IConstraintCalculation) s.newInstance();
        } catch (Exception e) {
            String errMsg = ERROR_SCRIPT;
            System.out.println(e.getMessage());
            throw new RuntimeException(errMsg);
        }
        return calc;
    }
}
