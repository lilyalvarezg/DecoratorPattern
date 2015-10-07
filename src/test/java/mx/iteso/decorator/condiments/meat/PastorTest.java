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
public class PastorTest {
    Taco taco;

    @Before
    public void setUp() {
        taco = mock(Taco.class);
    }

    public void MiniTestCost() {
        Taco pastor = new Pastor(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.MINI);
        double cost = pastor.cost();
        assertEquals(7.0, cost, 0);
    }

    @Test
    public void RegularTestCost() {
        Taco bistec = new Pastor(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.REGULAR);
        double cost = bistec.cost();
        assertEquals(8.0, cost, 0);
    }
    @Test
    public void MegaTestCost() {
        Taco bistec = new Pastor(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.MEGA);
        double cost = bistec.cost();
        assertEquals(10.0, cost, 0);
    }
    @Test
    public void DescriptionTest(){
        Taco bistec = new Pastor(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = bistec.getDescription();
        assertEquals("Taco Normal de pastor", desc);
    }
}
