/*
 * Copyright 2015 Hotwire. All Rights Reserved.
 *
 * This software is the proprietary information of Hotwire.
 * Use is subject to license terms.
 */

package freeman.pizzaStore.chicago;

import freeman.pizzaStore.Pizza;

/**
 * Created by odyssey on 10/16/2015.
 */
public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        name = "Pepperoni: Chicago Style Deep Dish Pepperoni Pizza";
        dough = "Pepperoni: Extra Thick Crust Dough";
        sauce = "Pepperoni: Plum Tomato Sauce";

        toppings.add("Pepperoni: Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Pepperoni: Cutting the pizza into square slices");
    }
}
