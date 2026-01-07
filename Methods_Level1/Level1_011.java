package Methods_Level1;
import java.util.Scanner;
public class Level1_011 {
    public double calculateWindChill(double temp, double windSpeed){
        return 35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temp * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Level1_011 obj = new Level1_011();
        double temp = input.nextDouble();
        double windSpeed = input.nextDouble();
        System.out.println(obj.calculateWindChill(temp,windSpeed));
    }
}
