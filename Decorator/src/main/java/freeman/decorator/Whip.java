package freeman.decorator;

import freeman.component.Beverage;

/**
 * Created by Odyssey on 14.10.2015.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
