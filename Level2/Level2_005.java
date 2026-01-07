package Level2;
import java.util.Scanner;
public class Level2_005 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fahrenheit = input.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.println(
                "The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius"
        );

        input.close();
    }
}
