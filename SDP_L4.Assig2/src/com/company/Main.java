package com.company;

public class Main {
    public static void main(String[] args) {
        Service lowPriority = new Service();
        SpecialService highPriority = new SpecialService();
        lowPriority.addService("Free tacos");
        lowPriority.addService("Extra candies");
        highPriority.addspecService("Free Wine");
        highPriority.addspecService("Special Massage");



        Guest someGuest1= new Guest("Bob");
        Guest someGuest2= new Guest("Pop");
        SpecialGuest eliteGuest1 = new SpecialGuest("Jordan");
        SpecialGuest eliteGuest2 = new SpecialGuest("Batis");

        lowPriority.registerGuest(someGuest1);
        lowPriority.registerGuest(someGuest2);
        lowPriority.removeService("Free tacos");
        lowPriority.unregisterGuest(someGuest1);

        highPriority.registerGuest(eliteGuest1);
        highPriority.registerGuest(eliteGuest2);
        highPriority.removespecService("Free Wine");
        highPriority.addspecService("Free box of Wine");
        highPriority.unregisterGuest(eliteGuest1);


    }
}
