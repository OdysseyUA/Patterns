package freeman.pizzaStore.chicago;

import freeman.pizzaStore.Pizza;
import freeman.pizzaStore.PizzaStore;

/**
 * Created by odyssey on 10/16/2015.
 */
public class ChicagoStylePizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        }
        else {
            return null;
        }

        return pizza;
    }
}
