package net.nickpalenchar;

public abstract class Duck {

    // HAS-A beheivors using an interface. The "type" of behavior can be changed.
    FlyBehavior flyBehavior;
    QuackBehavior quackBeheivor;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBeheivor.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBeheivor = qb;
    }
}