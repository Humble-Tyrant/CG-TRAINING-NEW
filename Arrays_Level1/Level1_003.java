package Arrays_Level1;
import java.util.*;
public class Level1_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] multiplicationTable = new int[10];
        for(int i=1;i<=multiplicationTable.length;i++){
            multiplicationTable[i-1]=t*i;
        }
        for(int j=1;j<=multiplicationTable.length;j++){
            System.out.println(t+"*"+j+"="+multiplicationTable[j-1]);
        }
        sc.close();
    }
}
