package Inheritence;

abstract class Appliance {
    abstract void operate();
}

class WashingMachine extends Appliance {
    void operate() {
        System.out.println("Washing clothes");
    }
}

public class Level_017 {
    public static void main(String[] args) {
        Appliance a = new WashingMachine();
        a.operate();
    }
}

