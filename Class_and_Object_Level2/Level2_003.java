package Class_and_Object_Level2;

class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is not a Palindrome");
        }
    }
}

public class Level2_003 {
    public static void main(String[] args) {

        PalindromeChecker pc = new PalindromeChecker();

        pc.text = "madam";

        pc.displayResult();
    }
}

