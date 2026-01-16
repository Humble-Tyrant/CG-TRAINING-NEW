package Class_and_Object_Level2;

class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Level2_002 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.accountHolder = "Amit";
        account.accountNumber = 1234567890L;
        account.balance = 5000.0;

        account.displayBalance();
        account.deposit(2000.0);
        account.withdraw(1500.0);
        account.displayBalance();
    }
}

