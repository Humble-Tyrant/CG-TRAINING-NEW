package CapgeminiCodingQuestions;

import java.util.Arrays;

public class CheckAnagram {
    static boolean checkAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i] != bArray[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkAnagram("abcdefg","gfedcba"));
    }
}
