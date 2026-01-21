package Inheritence;

class Printer1 {
    void print() {
        System.out.println("Printing");
    }
}

class Office {
    Printer1 printer = new Printer1();

    void printDocument() {
        printer.print();
    }
}

public class Level_018 {
    public static void main(String[] args) {
        Office o = new Office();
        o.printDocument();
    }
}

