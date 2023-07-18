public class Piano extends Instrumento implements Afinable {

    private int numTeclas;

    public Piano(String nomInstrumento, String marcaInstrumento, double precioInstrumento, int numTeclas) {

        super(nomInstrumento, marcaInstrumento, precioInstrumento);
        this.numTeclas = numTeclas;

    }


    @Override
    public String afinar() {
        return "El piano se esta afinando";
    }

    @Override
    public String tocar() {
        return "Se esta tocando el piano";
    }

}