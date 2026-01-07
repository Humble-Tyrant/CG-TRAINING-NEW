package Methods_Level1;
import  java.util.Scanner;
public class Level1_005 {
    int checkNumberSign(int a){
        if(a==0) return 0;
        else if(a>0) return 1;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Level1_005 obj = new Level1_005();
        int n = sc.nextInt();
        System.out.println(obj.checkNumberSign(n));
        sc.close();
    }
}

