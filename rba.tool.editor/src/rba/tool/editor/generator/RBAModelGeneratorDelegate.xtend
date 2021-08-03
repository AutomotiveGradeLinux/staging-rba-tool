package rba.tool.editor.generator

import com.google.inject.Inject
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.GeneratorContext
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.OutputConfiguration
import org.eclipse.xtext.util.CancelIndicator
import rba.tool.editor.generator.json.IJSONGenerator
import rba.tool.editor.generator.rtmodel.IRTModelUpdater
import rba.tool.editor.generator.z3.IConstraintGenerator
import rba.tool.editor.generator.z3.ISortValueGenerator

class RBAModelGeneratorDelegate implements IGenerator, IGenerator2 {

	@Inject(optional=true)
	private ISortValueGenerator sortValueGenerator;

	private ThreadLocal<Boolean> sortValueGeneratorInBuilding = new ThreadLocal<Boolean>() {
		override protected initialValue() {
			return false;
		}
	};

	@Inject(optional=true)
	private IRTModelUpdater rtModelUpdater;

	private ThreadLocal<Boolean> rtModelUpdaterInBuilding = new ThreadLocal<Boolean>() {
		override protected initialValue() {
			return false;
		}
	};

	@Inject(optional=true)
	private IConstraintGenerator constraintGenerator;

	private ThreadLocal<Boolean> constraintGeneratorInBuilding = new ThreadLocal<Boolean>() {
		override protected initialValue() {
			return false;
		}
	};

	@Inject(optional=true)
	private IJSONGenerator jsonGenerator;

	private ThreadLocal<Boolean> jsonGeneratorInBuilding = new ThreadLocal<Boolean>() {
		override protected initialValue() {
			return false;
		}
	};

	def public void generate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		generate(input.resourceSet, fsa, context);
	}

	def public void generate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if (sortValueGenerator !== null && !sortValueGeneratorInBuilding.get.booleanValue) {
			sortValueGeneratorInBuilding.set(true);
		}
		if (rtModelUpdater !== null && !rtModelUpdaterInBuilding.get.booleanValue) {
			rtModelUpdaterInBuilding.set(true);
		}
		if (constraintGenerator !== null && !constraintGeneratorInBuilding.get.booleanValue) {
			constraintGeneratorInBuilding.set(true);
		}
		if (jsonGenerator !== null && !jsonGeneratorInBuilding.get.booleanValue) {
			jsonGeneratorInBuilding.set(true);
		}

		try {
			beforeGenerate(input, fsa, context);
			doGenerate(input, fsa, context);
		} finally {
			afterGenerate(input, fsa, context);
		}
	}

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		doGenerate(input.resourceSet, fsa, context);
	}

	def void doGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if (sortValueGenerator !== null && sortValueGeneratorInBuilding.get.booleanValue) {
			sortValueGenerator.doGenerate(input, fsa, context);
		}
		if (rtModelUpdater !== null && rtModelUpdaterInBuilding.get.booleanValue) {
			rtModelUpdater.doGenerate(input, fsa, context);
		}
		if (constraintGenerator !== null && constraintGeneratorInBuilding.get.booleanValue) {
			constraintGenerator.doGenerate(input, fsa, context);
		}
		if (jsonGenerator !== null && jsonGeneratorInBuilding.get.booleanValue) {
			jsonGenerator.doGenerate(input, fsa, context);
		}
	}

	override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		beforeGenerate(input.resourceSet, fsa, context);
	}

	def void beforeGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if (sortValueGenerator !== null && sortValueGeneratorInBuilding.get.booleanValue) {
			sortValueGenerator.beforeGenerate(input, fsa, context);
		}
		if (rtModelUpdater !== null && rtModelUpdaterInBuilding.get.booleanValue) {
			rtModelUpdater.beforeGenerate(input, fsa, context);
		}
		if (constraintGenerator !== null && constraintGeneratorInBuilding.get.booleanValue) {
			constraintGenerator.beforeGenerate(input, fsa, context);
		}
		if (jsonGenerator !== null && jsonGeneratorInBuilding.get.booleanValue) {
			jsonGenerator.beforeGenerate(input, fsa, context);
		}
	}

	override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		afterGenerate(input.resourceSet, fsa, context);
	}

	def void afterGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if (sortValueGenerator !== null && sortValueGeneratorInBuilding.get.booleanValue) {
			sortValueGenerator.afterGenerate(input, fsa, context);
		}
		if (rtModelUpdater !== null && rtModelUpdaterInBuilding.get.booleanValue) {
			rtModelUpdater.afterGenerate(input, fsa, context);
		}
		if (constraintGenerator !== null && constraintGeneratorInBuilding.get.booleanValue) {
			constraintGenerator.afterGenerate(input, fsa, context);
		}
		if (jsonGenerator !== null && jsonGeneratorInBuilding.get.booleanValue) {
			jsonGenerator.afterGenerate(input, fsa, context);
		}
	}

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		doGenerate(input.resourceSet, fsa);
	}

	def void doGenerate(ResourceSet input, IFileSystemAccess fsa) {
		val casted = fsa as IFileSystemAccess2;
		val context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);
		try {
			beforeGenerate(input, casted, context);
			doGenerate(input, casted, context);
		} finally {
			afterGenerate(input, casted, context);
		}
	}

	def public void setRBAModelInBuilding(boolean value) {
		sortValueGeneratorInBuilding.set(value);
		rtModelUpdaterInBuilding.set(value);
		constraintGeneratorInBuilding.set(value);
		jsonGeneratorInBuilding.set(value);
	}

	def public boolean isRBAModelInBuilding() {
		if (sortValueGeneratorInBuilding.get().booleanValue) {
			return true;
		}
		if (rtModelUpdaterInBuilding.get().booleanValue) {
			return true;
		}
		if (constraintGeneratorInBuilding.get().booleanValue) {
			return true;
		}
		if (jsonGeneratorInBuilding.get().booleanValue) {
			return true;
		}
		return false;
	}
	
	def public Set<OutputConfiguration> getRBAModelGeneratorOutputConfigurations() {
		return newHashSet(IJSONGenerator.OUTPUT_CONFIGURATION);
	}

}
