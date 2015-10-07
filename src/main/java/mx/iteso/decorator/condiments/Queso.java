package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() {
        int mas=0;
        if(taco.getSize()== MINI){
            mas=1;
        }else if(taco.getSize()== REGULAR){
            mas=2;
        }else if(taco.getSize()==MEGA){
            mas=3;
        }
        return taco.cost()+mas;
    }
}
