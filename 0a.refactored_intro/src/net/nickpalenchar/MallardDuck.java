package net.nickpalenchar;
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBeheivor = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real mallard duck");
    }
}
