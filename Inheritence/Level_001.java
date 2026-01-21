package Inheritence;

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("Car moving");
    }
}

public class Level_001 {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}



