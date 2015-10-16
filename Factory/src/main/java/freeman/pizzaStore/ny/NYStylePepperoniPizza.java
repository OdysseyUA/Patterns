/*
 * Copyright 2015 Hotwire. All Rights Reserved.
 *
 * This software is the proprietary information of Hotwire.
 * Use is subject to license terms.
 */

package freeman.pizzaStore.ny;

import freeman.pizzaStore.Pizza;

/**
 * Created by odyssey on 10/16/2015.
 */
public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "NY Style Pepperoni and Cheese Pizza";
        dough = "Pepperoni: Thin Crust Dough";
        sauce = "Pepperoni: Marinara Sauce";

        toppings.add("Pepperoni: Greated Reggiano Cheese");
    }

}
