package Strings_Level1;
import java.util.Scanner;
public class Level1_001 {
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        boolean result = compareStrings(s1, s2);
        System.out.println(result ? "Yes" : "No");
        System.out.println(s1.equals(s2) ? "Yes" : "No");
        System.out.println((s1==s2) ? "Yes" : "No");
    }
}
