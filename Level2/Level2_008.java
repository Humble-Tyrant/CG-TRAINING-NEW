package Level2;


import java.util.Scanner;

public class Level2_008{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        String fromCity = input.nextLine();
        String viaCity = input.nextLine();
        String toCity = input.nextLine();

        double fromToVia = input.nextDouble();
        double viaToFinalCity = input.nextDouble();

        double timeTaken = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        System.out.println(
                "Hello " + name +
                        ", your journey starts from " + fromCity +
                        " via " + viaCity +
                        " to " + toCity + ".\n" +
                        "Total distance travelled is " + totalDistance + " miles " +
                        "and total time taken is " + timeTaken + " hours.\n" +
                        "Average speed during the journey is " + averageSpeed + " miles/hour."
        );

        input.close();
    }
}


