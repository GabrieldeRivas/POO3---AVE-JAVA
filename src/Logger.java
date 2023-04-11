public class Logger {
    private static String modo = "INFO";

    public static String getModo() {
        return modo;
    }

    public static void setModo(String nuevoModo) {
        if (nuevoModo == "INFO" || nuevoModo == "WARN" || nuevoModo == "ERROR") {
            modo = nuevoModo;
        }
        else {
            Logger.showError("El modo no es válido. Los modos posibles son: INFO, WARN y ERROR.");
        }
    }
    public static void showInfo(String mensaje) {
        if (modo == "INFO") {
            System.out.println("INFO: " + mensaje);
        }
    }

    public static void showWarn(String mensaje) {
        if (modo == "INFO" || modo == "WARN" ) {
            System.out.println("WARN: " + mensaje);
        }
    }

    public static void showError(String mensaje) {
        System.out.println("ERROR: " + mensaje);
    }
}
