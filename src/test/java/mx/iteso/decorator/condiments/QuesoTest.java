package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
/**
 * Created by Lily on 05/10/2015.
 */
public class QuesoTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco= mock((Taco.class));
    }

    @Test
    public void MiniTestCost(){
        Taco queso= new Queso(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.MINI);
        double cost = queso.cost();
        assertEquals(9.0, cost,0);
    }
    @Test
    public void RegularTestCost(){
        Taco queso= new Queso(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.REGULAR);
        double cost = queso.cost();
        assertEquals(10.0, cost,0);
    }
    @Test
    public void MegaTestCost(){
        Taco queso= new Queso(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.MEGA);
        double cost = queso.cost();
        assertEquals(11.0, cost,0);
    }
}
