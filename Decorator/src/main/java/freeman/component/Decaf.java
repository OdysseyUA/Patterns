package freeman.component;

/**
 * Created by Odyssey on 14.10.2015.
 */
public class Decaf extends Beverage {
    @Override
    public double cost() {
        return .77;
    }

    public Decaf() {
        description = "Decaf Coffee";
    }
}
