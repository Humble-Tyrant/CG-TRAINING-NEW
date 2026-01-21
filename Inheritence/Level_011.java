package Inheritence;

class Vehicle {
    void move() {
        System.out.println("Vehicle moving");
    }
}

class Bike extends Vehicle {
    @Override
    void move() {
        System.out.println("Bike moving");
    }
}

public class Level_011 {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.move();
    }
}

