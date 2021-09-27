package com.company;

import java.util.List;

public class Guest implements Observer{
    public String name;
    public Guest(String name) {
        this.name = name;
    }

    public void update(List<String> service) {
        System.out.println("Hello, "+this.name+"\nWe have nothing for you\n"+ service);
    }
}
