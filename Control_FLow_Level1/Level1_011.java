package Control_FLow_Level1;

import java.util.Scanner;

public class Level1_011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = sc.nextDouble();

            if (value <= 0) {
                break;
            }

            total = total + value;
        }

        System.out.println("Total value is " + total);

        sc.close();
    }
}

