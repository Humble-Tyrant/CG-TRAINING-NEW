package CapgeminiCodingQuestions;
import java.util.Scanner;
public class PyramidPattern {
    static void patternBuilder(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternBuilder(n);
        sc.close();
    }
}
