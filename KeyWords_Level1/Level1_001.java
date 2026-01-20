package KeyWords_Level1;

public class Level1_001 {

    static class BankAccount {
        static String bankName = "ABC Bank";
        static int totalAccounts = 0;

        final int accountNumber;
        String accountHolderName;

        BankAccount(int accountNumber, String accountHolderName) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            totalAccounts++;
        }

        static void getTotalAccounts() {
            System.out.println("Total Accounts: " + totalAccounts);
        }

        void display(Object obj) {
            if (obj instanceof BankAccount) {
                System.out.println(bankName + " " + accountHolderName + " " + accountNumber);
            }
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(101, "Ravi");
        b.display(b);
        BankAccount.getTotalAccounts();
    }
}

