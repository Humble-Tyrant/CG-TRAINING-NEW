package Strings_Level2;

import java.util.Scanner;

class Level2_001 {

    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println(customLength);
        System.out.println(builtInLength);
    }
}

