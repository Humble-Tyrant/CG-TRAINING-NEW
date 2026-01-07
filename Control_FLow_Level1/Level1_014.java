package Control_FLow_Level1;

import java.util.Scanner;

public class Level1_014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number > 0) {
            long factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial = factorial * i;
                i++;
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}
