package rba.tool.editor.ui.util.concurrent;

public interface IUnitOfProgress<R, P> {

    public static final Object FAMILY_UNIT_OF_PROGRESS = new Object();

    R exec(P state) throws Exception;

    public static abstract class Void<T> implements IUnitOfProgress<Object, T> {
        @Override
        public final Object exec(T state) throws Exception {
            process(state);
            return null;
        }

        public abstract void process(T state) throws Exception;
    }
}
