package FactoryPattern;

public class BusFactory implements Factory {
    @Override
    public Vehicle vehicleConstruction() {
        return new Bus();
    }
}