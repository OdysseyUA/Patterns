package freeman.component;

/**
 * Created by Odyssey on 14.10.2015.
 */
public class DarkRoast extends Beverage {
    @Override
    public double cost() {
        return .99;
    }

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
}
