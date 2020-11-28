import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before(){
        shop = new Shop("Music Shop");
    }

    @Test
    public void canGetName(){
        assertEquals("Music Shop", shop.getName());
    }
}
