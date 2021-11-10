package FactoryPattern;

public class Bus implements Vehicle {
    @Override
    public void setType(String type) {
        System.out.println("This type has six wheels");
    }
}
