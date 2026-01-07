package Level2;
import java.util.Scanner;
public class Level2_004 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius = input.nextDouble();

        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println(
                "The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit"
        );

        input.close();
    }
}
