package Inheritence;

class Printer {
    void print() {
        System.out.println("Printing");
    }
}

class AdvancedPrinter extends Printer {
}

public class Level_012 {
    public static void main(String[] args) {
        AdvancedPrinter p = new AdvancedPrinter();
        p.print();
    }
}

