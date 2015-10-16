package freeman.pizzaStore.ny;

import freeman.pizzaStore.Pizza;
import freeman.pizzaStore.PizzaStore;

/**
 * Created by odyssey on 10/16/2015.
 */
public class NYStylePizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        }
        else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }
        else {
            return null;
        }

        return pizza;
    }
}
