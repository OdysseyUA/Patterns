package freeman.decorator;

import freeman.component.Beverage;

/**
 * Created by Odyssey on 14.10.2015.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
