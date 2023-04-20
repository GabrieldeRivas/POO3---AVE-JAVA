public class Mariposa extends Aereo {

    protected double gramosIncrementados = 0;

    public Mariposa(String nombre) {
        super(nombre);
    }

    @Override
    public void comer(int gramos) {
        gramosIncrementados += (double) gramos / 5;
        Logger.showInfo(nombre + " comió " + gramos + " gramos.");
    }
}
