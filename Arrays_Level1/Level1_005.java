package Arrays_Level1;
import java.util.Scanner;
public class Level1_005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] multiplicationResult = new int[4];
        for(int i=1;i<=4;i++){
            multiplicationResult[i-1]=n*(i+5);
        }
        for(int i=1;i<=4;i++){
            System.out.println(n+"*"+(i+5)+"="+multiplicationResult[i-1]);
        }
        sc.close();

    }
}
