package freeman.duck;

import freeman.duck.fly.FlyWithWings;
import freeman.duck.quack.Quack;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("MallardDuck displaying..... I'm a real Mallard duck");
    }

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
