import Enums.InstrumentType;
import Instrument.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano grand;

    @Before
    public void before(){
        grand = new Piano(InstrumentType.KEYBOARD, "Grand Piano", 1000, 1200, "Marble Keys");
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.KEYBOARD, grand.getType());
    }
    @Test
    public void canGetboughtValue(){
        assertEquals(1000, grand.getBought());
    }
    @Test
    public void canGetSellPrice(){
        assertEquals(1200, grand.getSold());
    }
    @Test
    public void canGetKeys(){
        assertEquals("Marble Keys", grand.getKeys());
    }
    @Test
    public void canPlay(){
        assertEquals("What do you get when you drop a Grand Piano down a mine shaft?? A FLAT MINOR", grand.play(grand));
    }
}

