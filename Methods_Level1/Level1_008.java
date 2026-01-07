package Methods_Level1;
import java.util.Scanner;
public class Level1_008 {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int smallest = Math.min(number3,Math.min(number1, number2));
        int largest =Math.max(number3,Math.max(number1, number2));
        return new int[]{smallest,largest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        sc.close();
       for(int i:findSmallestAndLargest(number1,number2,number3)){
           System.out.print(i+" ");
       }
    }
}
