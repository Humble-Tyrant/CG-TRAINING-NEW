package Arrays_Level2;

import java.util.Scanner;

class Level2_007 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            double weight = sc.nextDouble();

            if (weight <= 0) {
                System.out.println("Invalid weight. Enter again.");
                i--;
                continue;
            }

            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            double height = sc.nextDouble();

            if (height <= 0) {
                System.out.println("Invalid height. Enter again.");
                i--;
                continue;
            }

            personData[i][0] = height;
            personData[i][1] = weight;
        }

        for (int i = 0; i < number; i++) {

            double height = personData[i][0];
            double weight = personData[i][1];

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");

        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]);
        }

        sc.close();
    }
}

