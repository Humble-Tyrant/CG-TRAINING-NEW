package Methods_Level2;

import java.util.Scanner;

class Level2_010 {

    static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] personData = new double[10][3];

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
        }

        calculateBMI(personData);
        String[] status = getBMIStatus(personData);

        System.out.println("\nWeight\tHeight(cm)\tBMI\t\tStatus");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t%.2f\t\t%.2f\t\t%s\n",
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    status[i]);
        }

        sc.close();
    }
}

