package com.company;

public class King extends Character {
    public King() {
        super(new BowAndArrowBehavior());
    }

    @Override
    void display() {
        System.out.println("I am the KING");
    }

}
