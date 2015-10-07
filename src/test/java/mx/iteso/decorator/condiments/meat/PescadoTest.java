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
public class PescadoTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test(expected=java.lang.Exception.class)
    public void testMiniDeclaration() throws Exception{
        Taco pescado = new Pescado(taco);
        when(taco.getSize()).thenReturn(taco.MINI);

    }
    @Test
    public void DescriptionTest(){
        Taco pescado = new Pescado(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = pescado.getDescription();
        assertEquals("Taco Normal de pescado", desc);
    }
    @Test
    public void RegularTestCost() {
        Taco pescado = new Pescado(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.REGULAR);
        double cost = pescado.cost();
        assertEquals(8.0, cost, 0);
    }
    @Test
    public void MegaTestCost() {
        Taco pescado = new Pescado(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.MEGA);
        double cost = pescado.cost();
        assertEquals(12.0, cost, 0);
    }
}
