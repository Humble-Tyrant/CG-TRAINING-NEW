package Inheritence;

class Account {
    int balance = 1000;
}

class SavingsAccount extends Account {
}

public class Level_016 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        System.out.println(s.balance);
    }
}

