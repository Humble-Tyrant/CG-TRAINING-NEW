package Inheritence;

class Base1 {
    void display() {
        System.out.println("Base display");
    }
}

class Child1 extends Base1 {
    @Override
    void display() {
        System.out.println("Child display");
    }
}

public class Level_008 {
    public static void main(String[] args) {
        Base1 b = new Child1();
        b.display();
    }
}


