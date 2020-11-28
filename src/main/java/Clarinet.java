public class Clarinet extends Instrument {
    private String type;

    public Clarinet(String family, String material, String colour, String type){
        super(family, material, colour);
        this.type = type;
    }
}
