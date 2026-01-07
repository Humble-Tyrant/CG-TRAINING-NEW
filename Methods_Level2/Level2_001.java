package Methods_Level2;

import java.util.Scanner;

class Level2_001 {

    static int[] findFactors(int number) {

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    static int sumOfFactors(int[] factors) {

        int sum = 0;
        for (int x : factors) {
            sum += x;
        }
        return sum;
    }

    static long productOfFactors(int[] factors) {

        long product = 1;
        for (int x : factors) {
            product *= x;
        }
        return product;
    }

    static double sumOfSquares(int[] factors) {

        double sum = 0;
        for (int x : factors) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Factors:");
        for (int x : factors) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));

        sc.close();
    }
}
