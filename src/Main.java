public class Main {
    public static void main(String[] args)
    {
        Logger.setModo("WARN");
        System.out.println(Logger.getModo());
        Golondrina pepita = new Golondrina("Pepita", 2);
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
        Golondrina pepon = new Golondrina("Pepón", 1);
        System.out.println(pepon.getEnergia());
        pepon.comer(8);
        System.out.println(pepon.getEnergia());
        pepon.pescar();
        System.out.println(pepon.getEnergia());
        System.out.println("Tests de Bombón");
        Paloma bombon = new Paloma("Bombón");
        System.out.println(bombon.getEnergia());
        bombon.comer(8);
        System.out.println(bombon.getEnergia());
        bombon.defecar();
        System.out.println(bombon.getEnergia());
    }
}
