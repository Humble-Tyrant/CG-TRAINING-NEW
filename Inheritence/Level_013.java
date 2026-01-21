package Inheritence;

class Parent2 {
    Parent2() {
        System.out.println("Parent constructor");
    }
}

class Child2 extends Parent {
    Child2() {
        super();
        System.out.println("Child constructor");
    }
}

public class Level_013 {
    public static void main(String[] args) {
        new Child2();
    }
}

