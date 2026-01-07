package Level1;
import java.util.Scanner;

public class Level1_013{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base = input.nextDouble();
        double height = input.nextDouble();

        double areaInSqInches = 0.5 * base * height;

        double areaInSqCm = areaInSqInches * 6.4516;

        System.out.println(
                "The area of the triangle in square inches is " + areaInSqInches +
                        " and in square centimeters is " + areaInSqCm
        );

        input.close();
    }
}

