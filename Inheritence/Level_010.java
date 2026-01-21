package Inheritence;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Flying");
    }

    public void swim() {
        System.out.println("Swimming");
    }
}

public class Level_010 {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}

