public class Aereo {
    protected String nombre;

    protected int distanciaRecorrida = 0;

    public Aereo(String nombre) {
        this.nombre = nombre;
    }

    public void comer(int gramos) {
        Logger.showInfo(nombre + " comió " + gramos + " gramos.");
    }

    public void volar(int kms) {
        distanciaRecorrida += kms;
        Logger.showInfo(nombre + " voló " + kms + " kilómetros.");
    }
}
