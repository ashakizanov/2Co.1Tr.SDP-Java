package FactoryPattern;

public class Car implements Vehicle {
    @Override
    public void setType(String type) {
        System.out.println("This type has four wheels");
    }
}
