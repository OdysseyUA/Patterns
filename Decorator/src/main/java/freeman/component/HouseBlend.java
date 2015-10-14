package freeman.component;

/**
 * Created by Odyssey on 14.10.2015.
 */
public class HouseBlend extends Beverage {
    @Override
    public double cost() {
        return .89;
    }

    public HouseBlend() {
        description = "House Blend Coffee";
    }
}
