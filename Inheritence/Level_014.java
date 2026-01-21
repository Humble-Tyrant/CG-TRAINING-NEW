package Inheritence;

class Shape1 {
    void draw() {
        System.out.println("Shape");
    }
}

class Rectangle extends Shape1 {
    @Override
    void draw() {
        System.out.println("Rectangle");
    }
}

public class Level_014 {
    public static void main(String[] args) {
        Shape1 s = new Rectangle();
        s.draw();
    }
}

