package Arrays_Level1;
import java.util.Scanner;
public class Level1_007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] evenNumbers= new int[number/2+1];
        int[] oddNumbers= new int[number/2+1];

        int i=1;
        int evenIndex=0;
        int oddIndex=0;
        while(i<number){
            if (i % 2 != 0) {
                oddNumbers[oddIndex++]=i;
            }
            else{
                evenNumbers[evenIndex++]=i;
            }
            i++;
        }
        for(int j=0;j<evenNumbers.length;j++){
            if(evenNumbers[j]==0) break;
            System.out.print(evenNumbers[j]+" ");
        }
        System.out.println();
        for(int j=0;j<oddNumbers.length;j++){
            if(oddNumbers[j]==0) break;
            System.out.print(oddNumbers[j]+" ");
        }
    }
}
