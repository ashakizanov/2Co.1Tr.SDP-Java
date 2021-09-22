package com.company;

public class Main {

    public static void main(String[] args) {
        Character character1 = new Troll();
        character1.display();
        character1.performAttack();
        character1.setWeapon(new SwordBehavior());
        character1.performAttack();

        Character character2 = new Knight();
        character2.display();
        character2.performAttack();
        character2.setWeapon(new BowAndArrowBehavior());
        character2.performAttack();
    }
}

