import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    Clarinet clarinet;

    @Before
    public void before(){
        clarinet = new Clarinet("Woodwind", "Wood", "wooden", 450, 500, "B");
    }

    @Test
    public void canGetFamily(){
        assertEquals("Woodwind", clarinet.getFamily());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Wood", clarinet.getMaterial());
    }

    @Test
    public void canSetFamily(){
        clarinet.setFamily("Brass");
        assertEquals("Brass", clarinet.getFamily());
    }

    @Test
    public void canGetColour(){
        assertEquals("wooden", clarinet.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals("B", clarinet.getType());
    }

    @Test
    public void canSetType(){
        clarinet.setType("Bass");
        assertEquals("Bass", clarinet.getType());
    }

    @Test
    public void clarinetCanPlay(){
        assertEquals("Clarinet is playing jazz", clarinet.play("jazz"));
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(500, clarinet.getSellingPrice());
    }

    @Test
    public void canSetSellingPrice(){
        clarinet.setSellingPrice(800);
        assertEquals(800, clarinet.getSellingPrice());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(50, clarinet.calculateMarkup());
    }
}
