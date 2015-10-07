package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Lengua  extends CondimentsDecorator {
    Taco taco;

    public Lengua (Taco taco){
        this.taco = taco;
        this.size=taco.getSize();
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de lengua";
    }

    @Override
    public double cost() {
        double ext=0.00;
        if(taco.getSize().equals(REGULAR)){
            ext=2;
        }else if(taco.getSize().equals(MINI))
            ext-=1;
        else if(taco.getSize().equals(MEGA))
            ext+=4;
        return ext + taco.cost();
    }
}
