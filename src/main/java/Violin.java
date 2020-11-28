public class Violin extends Instrument implements IPlay{

    private String type;

    public Violin(String family, String material, String colour, String type){
        super(family, material, colour);
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
