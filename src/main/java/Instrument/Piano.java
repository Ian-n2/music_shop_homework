package Instrument;

import Enums.InstrumentType;
import actions.IPlay;
import actions.ISell;

public class Piano extends Instrument{

    //instance vars
    private String keys;

    //constructor
    public Piano(InstrumentType type, String name, int bought, int sold, String keys) {
        super(type, name, bought, sold);
        this.keys = keys;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public String play(Instrument instrument) {
        return "What do you get when you drop a " + instrument.getName() + " down a mine shaft?? " +
                "A FLAT MINOR";
    }
}



