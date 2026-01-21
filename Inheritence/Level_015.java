package Inheritence;

class Base3 {
    void process() {
        System.out.println("Processing");
    }
}

class Child3 extends Base3 {
}

public class Level_015 {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.process();
    }
}

