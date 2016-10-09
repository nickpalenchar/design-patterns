package net.nickpalenchar;

/**
 * Created by nick on 10/5/16.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBeheivor = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
