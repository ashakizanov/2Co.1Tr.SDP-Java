package com.company;

public abstract class Character {

    public WeaponBehavior weapon;

    public Character(WeaponBehavior weapon){
        this.weapon =weapon;
    }

    public void performAttack(){
        weapon.useWeapon();
    }
    public void setWeapon(WeaponBehavior w){
        this.weapon=w;
    }

    abstract void display();
}
