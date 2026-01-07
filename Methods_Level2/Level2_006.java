package Methods_Level2;

import java.util.Scanner;

class Level2_006 {

    public static double convertFahrenheitToCelsius(double Fahrenheit) {
        return (Fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius: " + convertFahrenheitToCelsius(f));

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(c));

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Kilograms: " + convertPoundsToKilograms(pounds));

        System.out.print("Enter weight in kilograms: ");
        double kg = sc.nextDouble();
        System.out.println("Pounds: " + convertKilogramsToPounds(kg));

        System.out.print("Enter volume in gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("Liters: " + convertGallonsToLiters(gallons));

        System.out.print("Enter volume in liters: ");
        double liters = sc.nextDouble();
        System.out.println("Gallons: " + convertLitersToGallons(liters));

        sc.close();
    }
}

