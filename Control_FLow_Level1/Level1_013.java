package Control_FLow_Level1;

import java.util.Scanner;

public class Level1_013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum = loopSum + i;
            }

            System.out.println("Sum using for loop: " + loopSum);
            System.out.println("Sum using formula: " + formulaSum);

            if (loopSum == formulaSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("The computations do not match.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        sc.close();
    }
}

