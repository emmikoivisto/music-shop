public class Violin extends Instrument {

    private String type;

    public Violin(String family, String material, String colour, String type){
        super(family, material, colour);
        this.type = type;
    }
}
