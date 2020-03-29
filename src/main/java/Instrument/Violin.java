package Instrument;

import Enums.InstrumentType;
import actions.IPlay;

public class Violin extends Instrument{

    //instance vars
    private String strings;

    //constructor
    public Violin(InstrumentType type, String name, int bought, int sold, String strings){
        super(type, name, bought, sold);
        this.strings = strings;
    }

    public String getStrings() {
        return strings;
    }

    public String play(Instrument instrument){
        return "What do you call a cow that plays the " + instrument.getName() + "? Moozart!!";
    }
}
