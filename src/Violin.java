public class Violin extends Instrumento implements Afinable {

    private String tipoViolin;

    public Violin(String nomInstrumento, String marcaInstrumento, double precioInstrumento, String tipoViolin) {

        super(nomInstrumento, marcaInstrumento, precioInstrumento);
        this.tipoViolin = tipoViolin;

    }

    @Override
    public String afinar() {
        return "El violin se esta afinando";
    }

    @Override
    public String tocar() {
        return "Se esta tocando el violin";
    }

}