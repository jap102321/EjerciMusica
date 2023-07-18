public class Main {

    public static void main(String[] args) {

        Instrumento guitarra = new Guitarra("Guitarra", "Yamaha", 250000, 6);
        Instrumento piano = new Piano("Piano", "Yamaha", 550000, 76);
        Instrumento violin = new Violin("Violin", "Yamaha", 350000, "Acustico");

        System.out.println(guitarra.tocar());
        System.out.println(guitarra.afinar());
        System.out.println(piano.tocar());
        System.out.println(piano.afinar());
        System.out.println(violin.tocar());
        System.out.println(violin.afinar());

    }

}