/*
 * Copyright 2015 Hotwire. All Rights Reserved.
 *
 * This software is the proprietary information of Hotwire.
 * Use is subject to license terms.
 */

package freeman;

import freeman.pizzaStore.Pizza;
import freeman.pizzaStore.PizzaStore;
import freeman.pizzaStore.chicago.ChicagoStylePizzaStore;
import freeman.pizzaStore.ny.NYStylePizzaStore;

/**
 * Created by odyssey on 10/16/2015.
 */
public class PizzaStoreDriver {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("First order a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Second order a " + pizza.getName() + "\n");
    }
}
