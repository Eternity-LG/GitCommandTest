package main.NPEDEAL;

public class ObjectNullUtil {
    public static <T> T fixNull(CallBack<T> callback) {
        return fixNull(callback, null);
    }

    public static <T> T fixNull(CallBack<T> callback, NullPointExceptionCallBack<T> exceptionCallBack) {
        try {
            if (callback != null) {
                return callback.call();
            }
        } catch (NullPointerException e) {
            if (exceptionCallBack != null) {
                return exceptionCallBack.call(e);
            }
        }

        return null;
    }

    public interface CallBack<T> {
        T call();
    }

    public interface NullPointExceptionCallBack<T> {
        T call(NullPointerException e);
    }
}
