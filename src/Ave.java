public class Ave extends Aereo {
    protected int energia = 2;

    public Ave(String nombre) {
        super(nombre);
    }

    @Override
    public void comer(int gramos) {
        energia += gramos;
        Logger.showInfo(nombre + " comió " + gramos + " gramos.");
    }


    @Override
    public void volar(int kms) {
        if (hayEnergiaPara(kms * 3)) {
            energia -= kms * 3;
            distanciaRecorrida += kms;
            Logger.showInfo(nombre + " voló " + kms + " kilómetros.");
        }
        else {
            Logger.showError(nombre + " no tiene suficiente energía para volar esta distancia.");
        }
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public boolean hayEnergiaPara(int costo) {
        return energia - costo >= 0;
    }
}