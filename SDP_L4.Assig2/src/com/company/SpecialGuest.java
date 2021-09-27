package com.company;

import java.util.List;

public class SpecialGuest implements SpecialObserver{
    public String name;
    public SpecialGuest(String name) {
        this.name = name;
    }

    public void update(List<String> specService) {
        System.out.println("Hello, "+this.name+"\nWe have special service for you\n"+ specService);
    }

}
