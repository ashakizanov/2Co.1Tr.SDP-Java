package FactoryPattern;

public class Motorbike  implements Vehicle {
    @Override
    public void setType(String type) {
        System.out.println("This type has two wheels");
    }
}
