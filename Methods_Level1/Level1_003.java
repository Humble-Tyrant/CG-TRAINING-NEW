package Methods_Level1;

import java.util.Scanner;

public class Level1_003 {
    void maximumHandshakes(int n){
        int ans= (n * (n - 1)) / 2;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Level1_002 obj = new Level1_002();
        obj.maximumHandshakes(sc.nextInt());
        sc.close();
    }
}
