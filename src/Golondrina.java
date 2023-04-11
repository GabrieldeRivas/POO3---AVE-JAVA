import java.util.Random;

public class Golondrina extends Ave {
    protected int costoPesca;

    public Golondrina(String nombre, int costoPesca) {
        super(nombre);
        this.costoPesca = costoPesca;
    }

    private boolean logroPescar() {
        double rand = (new Random()).nextDouble();
        return rand < 0.1;
    }

    public void pescar() {
        if (hayEnergiaPara(costoPesca)) {
            energia -= costoPesca;
            if (logroPescar()) {
                energia += 10;
                Logger.showInfo(nombre + " tuvo éxito en la pesca.");
            }
            else {
                Logger.showWarn(nombre + " no logró pescar.");
            }
        }
        else {
            Logger.showError(nombre + " no tiene suficiente energía para pescar.");
        }
    }
}