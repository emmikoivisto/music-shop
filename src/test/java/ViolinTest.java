import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
       violin = new Violin("String", "Wood", "wooden", 670, 800, "Alto");
    }

    @Test
    public void canGetFamily(){
        assertEquals("String", violin.getFamily());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Wood", violin.getMaterial());
    }

    @Test
    public void canSetFamily(){
        violin.setFamily("Brass");
        assertEquals("Brass", violin.getFamily());
    }

    @Test
    public void canGetColour(){
        assertEquals("wooden", violin.getColour());
    }

    @Test
    public void violinCanPlay(){
        assertEquals("Violin is playing jazz", violin.play("jazz"));
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(130, violin.calculateMarkup());
    }

}
