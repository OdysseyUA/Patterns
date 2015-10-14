package freeman;

import freeman.component.Beverage;
import freeman.component.DarkRoast;
import freeman.component.Espresso;
import freeman.component.HouseBlend;
import freeman.decorator.Mocha;
import freeman.decorator.Soy;
import freeman.decorator.Whip;

/**
 * Created by Odyssey on 14.10.2015.
 */
public class CoffeeDriver {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
