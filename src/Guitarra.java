public class Guitarra extends Instrumento implements Afinable {

    private int numCuerdas;

    public Guitarra(String nomInstrumento, String marcaInstrumento, double precioInstrumento, int numCuerdas) {

        super(nomInstrumento, marcaInstrumento, precioInstrumento);
        this.numCuerdas = numCuerdas;

    }

    @Override
    public String tocar() {
        return "Se esta tocando la guitarra";
    }

    @Override
    public String afinar() {
        return "La guitarra se esta afinando";
    }

    @Override
    public String toString() {
        return "Guitarra{" +
                "numCuerdas=" + numCuerdas +
                '}';
    }
}