package com.company;

public interface Observable {
    void registerGuest(Observer Guest);
    void unregisterGuest(Observer Guest);
    void notifyAllGuest();
}
