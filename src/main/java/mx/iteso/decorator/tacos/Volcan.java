package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

/**
 * Created by Lily on 01/10/2015.
 */
public class Volcan extends Taco {

    public Volcan(String size){
        super.size= size;
        description= "Volcán "+ size;
    }
    @Override
    public double cost() {
        return 12.00;
    }
}

