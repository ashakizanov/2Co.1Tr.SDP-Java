package FactoryPattern;

public class MotorbikeFactory implements Factory {
    @Override
    public Vehicle vehicleConstruction() {
        return new Motorbike();
    }
}