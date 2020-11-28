public class Trombone extends Instrument implements IPlay  {
    private String valveType;

    public Trombone(String family, String material, String colour, int buyingPrice, int sellingPrice, String valveType){
        super(family, material, colour, buyingPrice, sellingPrice);
        this.valveType = valveType;
    }

    public String play(String title) {
        return "Trombone is playing " + title;
    }

    public String getValveType() {
        return valveType;
    }

    public void setValveType(String valveType) {
        this.valveType = valveType;
    }
}
