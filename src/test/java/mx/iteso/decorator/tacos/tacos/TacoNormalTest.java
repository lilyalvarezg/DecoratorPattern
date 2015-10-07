
package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TacoNormalTest {
    @Test
    public void RegularTestCost() {
        Taco taco = new TacoNormal("REGULAR");
        assertEquals(8.0, taco.cost(),0);
    }
    public void MiniTestCost() {
        Taco taco = new TacoNormal("MINI");
        assertEquals(7.0, taco.cost(),0);
    }
    public void MegaTestCost() {
        Taco taco = new TacoNormal("MEGA");
        assertEquals(9.0, taco.cost(),0);
    }
}

