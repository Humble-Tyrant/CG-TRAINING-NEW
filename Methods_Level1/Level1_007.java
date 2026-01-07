package Methods_Level1;
import java.util.Scanner;
public class Level1_007 {
    int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Level1_007 obj = new Level1_007();
        System.out.println(obj.sumOfNaturalNumbers(n));
    }
}
