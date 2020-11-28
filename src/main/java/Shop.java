import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Instrument> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<Instrument>();
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public void addInstrument(Instrument instrument){
        this.stock.add(instrument);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
