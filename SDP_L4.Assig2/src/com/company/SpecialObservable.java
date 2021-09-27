package com.company;

public interface SpecialObservable {
    void registerGuest(SpecialObserver SpecialGuest);
    void unregisterGuest(SpecialObserver SpecialGuest);
    void notifyAllGuest();
}
