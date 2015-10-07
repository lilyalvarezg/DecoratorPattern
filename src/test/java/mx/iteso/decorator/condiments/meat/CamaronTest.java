package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Lily on 06/10/2015.
 */
public class CamaronTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test(expected=java.lang.Exception.class)
    public void testMiniDeclaration() throws Exception{
        Taco camaron = new Camaron(taco);
        when(taco.getSize()).thenReturn(taco.MINI);

    }
    @Test
    public void DescriptionTest(){
        Taco camaron = new Camaron(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = camaron.getDescription();
        assertEquals("Taco Normal de camaron", desc);
    }
    @Test
    public void RegularTestCost() {
        Taco camaron = new Camaron(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.REGULAR);
        double cost = camaron.cost();
        assertEquals(8.0, cost, 0);
    }
    @Test
    public void MegaTestCost() {
        Taco bistec = new Camaron(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.MEGA);
        double cost = bistec.cost();
        assertEquals(12.0, cost, 0);
    }


}
