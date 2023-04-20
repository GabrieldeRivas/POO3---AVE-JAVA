import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Logger.getInstance("INFO");
        Mariposa twinkle = new Mariposa("Twinkle");
        Golondrina pepita = new Golondrina("Pepita", 2);
        Golondrina pepon = new Golondrina("Pepón", 1);
        Paloma bombon = new Paloma("Bombón");
        List<Aereo> list = Arrays.asList(
                twinkle,
                pepita,
                pepon,
                bombon);
        for (Aereo animal : list) {
            animal.comer(20);
            animal.volar(2);
            animal.comer(10);
            animal.volar(3);
            System.out.println(animal.distanciaRecorrida);
        }
        System.out.println("Tests de Pepita");
        System.out.println(pepita.getEnergia());
        pepita.comer(5);
        System.out.println(pepita.getEnergia());
        pepita.volar(1);
        System.out.println(pepita.getEnergia());
        pepita.comer(20);
        System.out.println(pepita.getEnergia());
        pepita.volar(2);
        System.out.println(pepita.getEnergia());
        pepita.volar(999); // ejemplo de que no hace nada al no tener suficiente energía
        System.out.println(pepita.getEnergia());
        pepita.setEnergia(10);
        System.out.println(pepita.getEnergia());
        pepita.pescar();
        System.out.println(pepita.getEnergia());
        System.out.println("Tests de Pepón");
        System.out.println(pepon.getEnergia());
        pepon.comer(8);
        System.out.println(pepon.getEnergia());
        pepon.pescar();
        System.out.println(pepon.getEnergia());
        System.out.println("Tests de Bombón");
        System.out.println(bombon.getEnergia());
        bombon.comer(8);
        System.out.println(bombon.getEnergia());
        bombon.defecar();
        System.out.println(bombon.getEnergia());
    }
}
