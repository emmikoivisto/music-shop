public class Trombone extends Instrument {
    private String valveType;

    public Trombone(String family, String material, String colour, String valveType){
        super(family, material, colour);
        this.valveType = valveType;
    }
}
