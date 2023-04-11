public class Paloma extends Ave {

    public Paloma(String nombre) {
        super(nombre);
    }

    public void defecar() {
        if (hayEnergiaPara(1)) {
            energia -= 1;
            Logger.showInfo(nombre + " defecó.");
        }
        else {
            Logger.showError(nombre + " no tiene suficiente energía para poder defecar.");
        }
    }
}