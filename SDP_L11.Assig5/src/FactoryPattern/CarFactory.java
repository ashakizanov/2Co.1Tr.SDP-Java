package FactoryPattern;

public class CarFactory implements Factory {
    @Override
    public Vehicle vehicleConstruction() {
        return new Car();
    }
}