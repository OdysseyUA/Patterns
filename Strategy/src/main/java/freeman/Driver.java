package freeman;

import freeman.duck.Duck;
import freeman.duck.fly.FlyRocketPowered;
import freeman.duck.MallardDuck;
import freeman.duck.ModelDuck;

public class Driver {

    public static void main(String[] args) {

        Duck duck = new MallardDuck();
        duck.display();
        duck.performQuack();
        duck.performFly();

        duck = new ModelDuck();
        duck.display();
        duck.performQuack();
        duck.performFly();

        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performQuack();
        duck.performFly();
    }
}
