package com.company;

import java.util.ArrayList;
import java.util.List;

public class Service implements Observable{
    private List<String> service = new ArrayList<>();
    private List<Observer> newbie = new ArrayList<>();





    public void addService(String service){
        this.service.add(service);
        notifyAllGuest();
    }
    public void removeService(String service){
        this.service.remove(service);
        notifyAllGuest();
    }

    @Override
    public void registerGuest(Observer newbie) {
        this.newbie.add(newbie);
    }

    @Override
    public void unregisterGuest(Observer Guest) {
        this.newbie.remove(Guest);
    }

    @Override
    public void notifyAllGuest() {
        for(Observer Guest: this.newbie){
            Guest.update(this.service);
        }
    }
}
