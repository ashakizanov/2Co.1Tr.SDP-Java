package FactoryPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What vehicle do you prefer?");
        System.out.println("1 Car");
        System.out.println("2 Bus");
        System.out.println("3 Motorbike");

        Scanner scanner = new Scanner(System.in);
        short choice = scanner.nextShort();

        if (choice == 1) {
            Factory factory = new CarFactory();
            Vehicle vehicle = factory.vehicleConstruction();
            String type = new String();
            vehicle.setType(type);
        }
        if (choice == 2) {
            Factory factory = new BusFactory();
            Vehicle vehicle = factory.vehicleConstruction();
            String type = new String();
            vehicle.setType(type);
        }
        if (choice == 3) {
            Factory factory = new MotorbikeFactory();
            Vehicle vehicle = factory.vehicleConstruction();
            String type = new String();
            vehicle.setType(type);
        }
    }
}
