package Methods_Level1;
import java.util.Scanner;
public class Level1_004 {
    double numberOfRounds(double a,double b ,double c){
        return 5000.0/(a+b+c);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double s1 = sc.nextDouble();
       double s2 = sc.nextDouble();
       double s3 = sc.nextDouble();
       Level1_004 obj = new Level1_004();
       System.out.println(obj.numberOfRounds(s1,s2,s3));
       sc.close();
    }
}
