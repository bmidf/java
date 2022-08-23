package exceptions.customExc;

public class RuntimeExceptionEx extends RuntimeException {
    public RuntimeExceptionEx(String s) {
        super(s);
    }
    public RuntimeExceptionEx(Throwable cause) {
        super(cause);
    }
}
