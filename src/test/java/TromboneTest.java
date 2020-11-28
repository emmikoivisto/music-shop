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

}
