package com.company;

public class Queen extends Character {
    public Queen() {

        super(new KnifeBehavior());
    }

    @Override
    void display() {
        System.out.println("I am the QUEEN");
    }
}
