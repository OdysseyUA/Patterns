package freeman.component;

/**
 * Created by Odyssey on 14.10.2015.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
