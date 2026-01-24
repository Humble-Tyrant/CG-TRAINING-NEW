package CodingQuestions;

import java.util.Arrays;

public class CountEvenAndOdd {
    static int[] countEvenAndOdd(int num) {
        int evenCount = 0;
        int oddCount = 0;
        while(num>0){
            int digit=num%10;
            if(digit%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            num/=10;

        }
        return new int[]{evenCount,oddCount};
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(countEvenAndOdd(1234)));
    }
}
