package Arrays_Level2;

import java.util.Scanner;

class Level2_001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalEmployees = 10;

        double[] salary = new double[totalEmployees];
        double[] serviceYears = new double[totalEmployees];
        double[] bonus = new double[totalEmployees];
        double[] newSalary = new double[totalEmployees];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < totalEmployees; i++) {

            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            double s = sc.nextDouble();

            System.out.print("Years of Service: ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Please re-enter.");
                i--;
                continue;
            }

            salary[i] = s;
            serviceYears[i] = y;
        }

        for (int i = 0; i < totalEmployees; i++) {

            if (serviceYears[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTotal Bonus Paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}

