import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Clarinet clarinet;
    Trombone trombone;
    Violin violin;

    @Before
    public void before(){
        shop = new Shop("Music Shop");
        violin = new Violin("String", "Wood", "wooden", 670, 800, "Alto");
        trombone = new Trombone("Brass", "brass", "brassy", 900, 1500, "rotary");
        clarinet = new Clarinet("Woodwind", "Wood", "wooden", 450, 500, "B");
    }

    @Test
    public void canGetName(){
        assertEquals("Music Shop", shop.getName());
    }

    @Test
    public void canSetName(){
        shop.setName("Notes Funny");
        assertEquals("Notes Funny", shop.getName());
    }

    @Test
    public void canAddInstrument(){
        shop.addInstrument(clarinet);
        shop.addInstrument(trombone);
        shop.addInstrument(violin);
        assertEquals(3, shop.getStockCount());
    }
}
