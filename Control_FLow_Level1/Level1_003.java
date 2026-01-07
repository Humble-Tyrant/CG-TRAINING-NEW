package Control_FLow_Level1;

import java.util.Scanner;

public class Level1_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("Is the first number the largest? Yes");
            System.out.println("Is the second number the largest? No");
            System.out.println("Is the third number the largest? No");
        }
        else if (number2 > number1 && number2 > number3) {
            System.out.println("Is the first number the largest? No");
            System.out.println("Is the second number the largest? Yes");
            System.out.println("Is the third number the largest? No");
        }
        else if (number3 > number1 && number3 > number2) {
            System.out.println("Is the first number the largest? No");
            System.out.println("Is the second number the largest? No");
            System.out.println("Is the third number the largest? Yes");
        }
        else {
            System.out.println("Is the first number the largest? No");
            System.out.println("Is the second number the largest? No");
            System.out.println("Is the third number the largest? No");
        }

        sc.close();
    }
}

