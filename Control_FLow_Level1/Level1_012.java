package Control_FLow_Level1;

import java.util.Scanner;

public class Level1_012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            // Sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Sum using while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum = loopSum + i;
                i++;
            }

            System.out.println("Sum using while loop: " + loopSum);
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
