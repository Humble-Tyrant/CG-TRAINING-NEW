package Methods_Level1;
import java.util.Scanner;
public class Level1_001 {
    double getSimpleInterest(double principle,double rate,double time){
        return principle*rate*time/100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principle = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        Level1_001 obj = new Level1_001();
        double ans=obj.getSimpleInterest(principle,rate,time);
        //Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
        System.out.println("The Simple Interest is "+ans+" for Principal "+principle+" and Rate "+rate+" and Time "+time);
        sc.close();
    }
}
