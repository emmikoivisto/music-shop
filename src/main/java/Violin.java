public class Violin extends Instrument implements IPlay{

    private String type;

    public Violin(String family, String material, String colour, int buyingPrice, int sellingPrice, String type){
        super(family, material, colour, buyingPrice, sellingPrice);
        this.type = type;
    }

    public String play(String title) {
        return "Violin is playing " + title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
