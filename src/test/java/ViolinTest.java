import Enums.InstrumentType;
import Instrument.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin(InstrumentType.STRING, "Violin", 200, 300, "Strings");
    }
   @Test
   public void canPlay(){
        assertEquals("What do you call a cow that plays the Violin? Moozart!!", violin.play(violin));
   }
}
