package CodingQuestions;
import java.util.Scanner;
public class isPalindrome {
    static boolean checkPalindrome(int str) {
        if (str == 0)
            return true;
        if (str % 10 == 0)
            return false;
        int rev=0;
        int temp=str;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(checkPalindrome(t));
        sc.close();
    }
}
