import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {
    Trombone trombone;

    @Before
    public void before(){
        trombone = new Trombone("Brass", "brass", "brassy", "rotary");
    }

    @Test
    public void canGetFamily(){
        assertEquals("Brass", trombone.getFamily());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("brass", trombone.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("brassy", trombone.getColour());
    }

    @Test
    public void canGetValveType(){
        assertEquals("rotary", trombone.getValveType());
    }

    @Test
    public void canSetValveType(){
        trombone.setValveType("axel");
        assertEquals("axel", trombone.getValveType());
    }

    @Test
    public void tromboneCanPlay(){
        assertEquals("Trombone is playing jazz", trombone.play("jazz"));
    }

}
