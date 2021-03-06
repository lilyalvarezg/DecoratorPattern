package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Chorizo extends CondimentsDecorator {
    Taco taco;

    public Chorizo(Taco taco){
        this.taco = taco;
        this.size=taco.getSize();
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de chorizo";
    }

    @Override
    public double cost() {
        double ext=0.00;
        if(taco.getSize().equals(REGULAR)){
            ext=0;
        }else if(taco.getSize().equals(MINI))
            ext-=1;
        else if(taco.getSize().equals(MEGA))
            ext+=2;
        return ext + taco.cost();
    }

}
