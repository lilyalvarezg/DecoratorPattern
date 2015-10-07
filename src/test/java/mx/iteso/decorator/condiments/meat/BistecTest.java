package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.Queso;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class BistecTest {
    Taco taco;

    @Before
    public void setUp() {
        taco = mock(Taco.class);
    }

    public void MiniTestCost() {
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.MINI);
        double cost = bistec.cost();
        assertEquals(7.0, cost, 0);
    }

    @Test
    public void RegularTestCost() {
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.REGULAR);
        double cost = bistec.cost();
        assertEquals(8.0, cost, 0);
    }
    @Test
    public void MegaTestCost() {
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.MEGA);
        double cost = bistec.cost();
        assertEquals(10.0, cost, 0);
    }
    @Test
    public void DescriptionTest(){
        Taco bistec = new Bistec(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = bistec.getDescription();
        assertEquals("Taco Normal de bistec", desc);
    }

}