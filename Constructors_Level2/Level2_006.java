package Constructors_Level2;

public class Level2_006 {

    static class BankAccount {
        public int accountNumber;
        protected String accountHolder;
        private double balance;

        BankAccount(int a, String h, double b) {
            accountNumber = a;
            accountHolder = h;
            balance = b;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double b) {
            balance = b;
        }
    }

    static class SavingsAccount extends BankAccount {
        SavingsAccount(int a, String h, double b) {
            super(a, h, b);
        }

        void display() {
            System.out.println(accountNumber + " " + accountHolder);
        }
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, "Ravi", 5000);
        sa.display();
    }
}

