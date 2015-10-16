package freeman.pizzaStore;

/**
 * Created by odyssey on 10/16/2015.
 */
public abstract class PizzaStore {

    protected Pizza pizza;

    public Pizza orderPizza(String type) {
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
