package freeman;

import freeman.duck.Duck;
import freeman.duck.fly.FlyRocketPowered;
import freeman.duck.MallardDuck;
import freeman.duck.ModelDuck;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        List<Duck>ducks = new ArrayList<Duck>();
        ducks.add(new MallardDuck());
        ducks.add(new ModelDuck());

        for(Duck d : ducks) {
            d.display();
            d.performQuack();
            d.performFly();
        }

        ducks.get(1).setFlyBehavior(new FlyRocketPowered());
        ducks.get(1).performQuack();
        ducks.get(1).performFly();
    }
}
