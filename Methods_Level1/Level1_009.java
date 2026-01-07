package Methods_Level1;
import java.util.Scanner;
public class Level1_009 {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int remainder = number%divisor;
        int quotient = number/divisor;
        return  new int[]{remainder,quotient};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int divisor = sc.nextInt();
        sc.close();
        for(int i:findRemainderAndQuotient(number,divisor)){
            System.out.print(i+" ");
        }
    }
}
