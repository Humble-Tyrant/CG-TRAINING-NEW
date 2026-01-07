package Control_FLow_Level2;

import java.util.Scanner;

public class Level2_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 1) {
            int greatestFactor = 1;
            int counter = number - 1;

            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }

            System.out.println(
                    "Greatest factor of " + number + " besides itself is " + greatestFactor
            );
        } else {
            System.out.println("Please enter an integer greater than 1.");
        }

        sc.close();
    }
}

