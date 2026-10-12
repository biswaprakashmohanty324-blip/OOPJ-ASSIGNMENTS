class Vehicle1 {
    void drive() {
        System.out.println("Repairing a vehicle");
    }
}

class Car extends Vehicle {
    
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class ASS9Q1{
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
