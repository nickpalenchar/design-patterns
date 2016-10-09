package net.nickpalenchar;

/**
 * Created by nick on 10/9/16.
 *
 * Character is the abstract class, all actual characters (like Knight) is of type Character. The WeaponBehavior is an interface that gets
 * implemented by various weapon classes
 */
public class Character {
    public WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }

    public void fight(){
        weapon.useWeapon();
    }

}
