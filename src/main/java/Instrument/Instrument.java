package Instrument;

import Enums.InstrumentType;
import actions.IPlay;
import actions.ISell;

import java.net.Proxy;

public abstract class Instrument implements ISell, IPlay {

    //instance vars
    private InstrumentType type;
    private String name;
    private int bought;
    private int sold;


    //constructor
    public Instrument(InstrumentType type, String name, int bought, int sold){
        this.type = type;
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

    public InstrumentType getType() {
        return this.type;
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
    public int calculateMarkup(){
    int result = this.getSold() - this.getBought();
    return result;
    }


}
