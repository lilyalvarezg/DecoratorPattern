package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {
    public Quesadilla(String size) {
        this.size= size;
        description = "Quesadilla";
    }

    @Override
    public double cost() {
        String size = getSize();
        double cost = 10.00;
        if (size.equals(Taco.MINI))
            cost -= 1.00;
        else if (size.equals(Taco.MEGA))
            cost += 1.00;
        return cost;
    }
}
