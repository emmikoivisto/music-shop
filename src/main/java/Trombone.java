public class Trombone extends Instrument implements IPlay  {
    private String valveType;

    public Trombone(String family, String material, String colour, String valveType){
        super(family, material, colour);
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
