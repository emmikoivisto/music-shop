import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public void addInstrument(ISell instrument){
        this.stock.add(instrument);
    }

    public void sellInstrument(ISell instrument){
        this.stock.remove(instrument);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
