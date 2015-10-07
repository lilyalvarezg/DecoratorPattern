package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Bistec extends CondimentsDecorator {
    Taco taco;

    public Bistec (Taco taco){
        this.taco = taco;
        this.size=taco.getSize();
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de bistec";
    }

    @Override
    public double cost() {
        int ext=0;
        if(taco.getSize().equals(REGULAR)){
            ext=0;
        }else if(taco.getSize().equals(MINI))
            ext=1;
        else if(taco.getSize().equals(MEGA))
            ext=2;
        return ext + taco.cost();
    }
}
