package Arrays_Level1;
import java.util.Scanner;
public class Level1_004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double sum=0.0;
        int m =0;
        while(true){
            double p=sc.nextDouble();
            arr[m]=p;

            m++;
            if(p<=0){
                break;
            }
        }
        for (double v : arr) {
            sum += v;
        }
        System.out.println(sum);
        sc.close();

    }
}
