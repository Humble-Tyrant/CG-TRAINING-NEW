package Arrays_Level1;
import java.util.Scanner;
public class Level1_006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heightOfPlayers = new double[11];
        for(int i=0;i<heightOfPlayers.length;i++){
            heightOfPlayers[i] = sc.nextDouble();
        }

        double sum=0;
        for (double heightOfPlayer : heightOfPlayers) {
            sum += heightOfPlayer;
        }
        double mean = sum/heightOfPlayers.length;
        System.out.println(mean);
        sc.close();

    }
}
