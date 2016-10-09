package net.nickpalenchar;

public class Main {

    public static void main(String[] args) {
        Character knight = new Knight();
        knight.setWeapon(new KnifeBehavior());

        knight.fight();

        knight.setWeapon(new BowAndArrowBehavior());
        knight.fight();

    }
}
