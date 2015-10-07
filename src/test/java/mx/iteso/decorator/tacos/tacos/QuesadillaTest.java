package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lily on 06/10/2015.
 */
public class QuesadillaTest {
    @Test
    public void RegularTestCost() {
        Taco taco = new Quesadilla("REGULAR");
        assertEquals(10.0, taco.cost(),0);
    }
    public void MiniTestCost() {
        Taco taco = new Quesadilla("MINI");
        assertEquals(9.0, taco.cost(),0);
    }
    public void MegaTestCost() {
        Taco taco = new Quesadilla("MEGA");
        assertEquals(11.0, taco.cost(),0);
    }
}
