package Inheritence;

class Base {
    void show() {
        System.out.println("Base");
    }
}

class Child extends Base {
}

public class Level_004 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}

