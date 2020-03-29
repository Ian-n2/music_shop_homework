import Enums.InstrumentType;
import Instrument.Piano;
import Instrument.Violin;
import OtherStock.Bow;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    Violin violin;
    Bow bow;

    @Before
    public void before(){
        shop = new Shop("Niall's Noise machines");
        piano = new Piano(InstrumentType.KEYBOARD,"Simple Piano", 900, 1100, "Simple Keys");
        violin = new Violin(InstrumentType.STRING,"violin", 600, 800, "Strong Strings");
        bow = new Bow("Horse hair", 10, 25);
    }
    @Test
    public void canGetName(){
        assertEquals("Niall's Noise machines", shop.getName());
    }
    @Test
    public void canAddStockAndCountIt(){
        shop.stockup(piano);
        assertEquals(1,shop.countStock());
    }
    @Test
    public void canAvoidTax(){
        shop.setName("Niall's New Noise machines");
        assertEquals("Niall's New Noise machines", shop.getName());
    }
    @Test
    public void canSellStock(){
        shop.stockup(violin);
        assertEquals("Thank you for buying from Niall's Noise machines",shop.sell(violin));
        assertEquals(0,shop.countStock());
    }
    @Test
    public void ItemSoldOut(){
        assertEquals("sorry we are sold out of that have you thought of maybe taking up a instrument that is in stock?", shop.sell(piano));
    }
    @Test
    public void checkMarkup(){
        shop.stockup(violin);
        shop.stockup(piano);
        shop.stockup(bow);
        assertEquals(415,shop.totalMarkUp());
    }
}

