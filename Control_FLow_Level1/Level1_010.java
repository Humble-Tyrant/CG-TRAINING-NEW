package Control_FLow_Level1;

import java.util.Scanner;

public class Level1_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double value;

        System.out.print("Enter a number (0 to stop): ");
        value = sc.nextDouble();

        while (value != 0) {
            total = total + value;

            System.out.print("Enter a number (0 to stop): ");
            value = sc.nextDouble();
        }

        System.out.println("Total value is " + total);

        sc.close();
    }
}

