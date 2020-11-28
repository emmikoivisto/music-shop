import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Clarinet clarinet;
    Trombone trombone;

    @Before
    public void before(){
        shop = new Shop("Music Shop");
        trombone = new Trombone("Brass", "brass", "brassy", 900, 1500, "rotary");
        clarinet = new Clarinet("Woodwind", "Wood", "wooden", 450, 500, "B");
    }

    @Test
    public void canGetName(){
        assertEquals("Music Shop", shop.getName());
    }

    @Test
    public void canAddInstrument(){

    }

//    @Test
//    public void canAddInstrument(){
//        shop.addInstrument(clarinet);
//        shop.addInstrument(trombone);
//        assertEquals(2, shop.getStockCount());
//    }
}
