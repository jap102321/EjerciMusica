public abstract class Instrumento implements Afinable {

    private String nomInstrumento;

    private String marcaInstrumento;

    private double precioInstrumento;

    public Instrumento(String nomInstrumento, String marcaInstrumento, double precioInstrumento) {

        this.nomInstrumento = nomInstrumento;
        this.marcaInstrumento = marcaInstrumento;
        this.precioInstrumento = precioInstrumento;

    }

    public abstract String tocar();

}