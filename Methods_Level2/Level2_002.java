package Methods_Level2;

import Methods_Level1.Level1_007;

import java.util.Scanner;

public class Level2_002 {
    int sumOfNaturalNumbers(int n) {
        if(n==1) return 1;
        return sumOfNaturalNumbers(n-1) +n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Level2_002 obj = new Level2_002();
        System.out.println(obj.sumOfNaturalNumbers(n));
    }
}
