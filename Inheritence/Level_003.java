package Inheritence;

class Bird {
    void fly() {
        System.out.println("Flying");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow flying");
    }
}

public class Level_003 {
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.fly();
    }
}


