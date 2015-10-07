package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

/**
 * Created by Lily on 01/10/2015.
 */
public class Camaron extends CondimentsDecorator{
    Taco taco;

    public Camaron(Taco taco) {
        this.taco = taco;
        this.size= taco.getSize();
    }

    @Override
    public String getDescription() {
        return taco.getDescription()+ " de camaron";
    }

    @Override
    public double cost() {
            int mas = 0;
            if (taco.getSize().equals(REGULAR)) {
                mas = 0;
            } else if (taco.getSize().equals(MEGA)) {
                mas = 4;
            } else if (taco.getSize().equals(MINI)){
                throw new RuntimeException("NO tamaño mini para los tacos de camaron");
            }
            return mas + taco.cost();
        }
}
