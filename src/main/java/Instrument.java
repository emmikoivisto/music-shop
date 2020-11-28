public abstract class Instrument {
    private String family;
    private String material;
    private String colour;

    public Instrument(String family, String material, String colour){
        this.family = family;
        this.material = material;
        this.colour = colour;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
