import java.util.Objects;

public class Logger {

    private static Logger log;
    private static String modo;

    private Logger(String modo) {
        this.modo = modo;
    }

    public static Logger getInstance(String modo) {
        if (log == null) {
            log = new Logger(modo);
        }
        return log;
    }

    public static void showInfo(String mensaje) {
        if (Objects.equals(modo, "INFO")) {
            System.out.println("INFO: " + mensaje);
        }
    }

    public static void showWarn(String mensaje) {
        if (Objects.equals(modo, "INFO") || Objects.equals(modo, "WARN")) {
            System.out.println("WARN: " + mensaje);
        }
    }

    public static void showError(String mensaje) {
        System.out.println("ERROR: " + mensaje);
    }
}
