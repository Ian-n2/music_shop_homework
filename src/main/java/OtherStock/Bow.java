package OtherStock;

import actions.ISell;

public class Bow implements ISell {
    // instance Vars
    private String name;
    private int bought;
    private int sold;

    //constructor
    public Bow(String name, int bought, int sold) {
        this.name = name;
        this.bought = bought;
        this.sold = sold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBought() {
        return bought;
    }

    public void setBought(int bought) {
        this.bought = bought;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int calculateMarkup() {
        int result = this.getSold() - this.getBought();
        return result;
    }
}
