package net.nickpalenchar;

/**
 * Created by nick on 10/9/16.
 * DuckCall is a device that uses duck behavior but isn't a duck at all. This example uses QuackBehavior without inheriting
 * form the Duck class
 */

public class DuckCall {

    public QuackBehavior quackBehavior = new Quack();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void display() {
        System.out.println("This is just a device");
    }
}
