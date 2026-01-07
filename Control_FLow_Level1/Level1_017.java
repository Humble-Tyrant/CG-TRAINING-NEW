package Control_FLow_Level1;

import java.util.Scanner;

public class Level1_017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount is " + bonus);
        } else {
            System.out.println("Bonus amount is 0");
        }

        sc.close();
    }
}

