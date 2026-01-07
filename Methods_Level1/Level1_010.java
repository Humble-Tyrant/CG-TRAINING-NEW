package Methods_Level1;
import java.util.Arrays;
import java.util.Scanner;
public class Level1_010 {
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
        int[] arr=findRemainderAndQuotient(number,divisor);
        System.out.println(arr[1]+" chocolates will be divided in "+divisor+" children and "+arr[0]+" chocolates will be left");

    }
}
