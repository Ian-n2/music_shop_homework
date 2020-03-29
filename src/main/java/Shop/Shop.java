package Shop;

import Instrument.Instrument;
import actions.ISell;

import java.util.ArrayList;

public class Shop {
    //instance var
    private String name;
    private ArrayList<ISell> stock;

    //constructor
    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void stockup(ISell stockItem) {
        stock.add(stockItem);
    }

    public int countStock() {
        return stock.size();
    }

    public String sell(ISell stockItem) {
        if (stock.contains(stockItem)) {
            stock.remove(stockItem);
            return "Thank you for buying from " + this.name;
        } else {
            return "sorry we are sold out of that have you thought of maybe taking up a instrument that is in stock?";
        }
    }

    public int totalMarkUp(){
        int total = 0;
        for (ISell stockItem:this.stock){
            total += stockItem.calculateMarkup();
        }
        return total;
    }


}

