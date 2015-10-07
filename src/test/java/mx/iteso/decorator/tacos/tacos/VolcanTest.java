
package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Volcan;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolcanTest {
    @Test
   public void Volcan_Test(){
        Taco taco= new Volcan("REGULAR");
        assertEquals(12.0, taco.cost(),0);
    }
}