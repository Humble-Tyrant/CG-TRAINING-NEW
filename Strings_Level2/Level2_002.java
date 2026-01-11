package Strings_Level2;

import java.util.Scanner;
import java.util.Arrays;

class Level2_002 {

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

    static String[] customSplit(String text) {
        int len = findLength(text);
        int wordCount = 0;

        if (len > 0 && text.charAt(0) != ' ') {
            wordCount++;
        }

        for (int i = 1; i < len; i++) {
            if (text.charAt(i - 1) == ' ' && text.charAt(i) != ' ') {
                wordCount++;
            }
        }

        int[] spaceIndex = new int[wordCount + 1];
        int idx = 0;
        spaceIndex[idx++] = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i + 1;
            }
        }
        spaceIndex[idx] = len;

        String[] words = new String[wordCount];
        int w = 0;

        for (int i = 0; i < idx; i++) {
            int start = spaceIndex[i];
            int end = (i + 1 < idx) ? spaceIndex[i + 1] - 1 : len;

            String temp = "";
            for (int j = start; j < end; j++) {
                if (text.charAt(j) != ' ') {
                    temp += text.charAt(j);
                }
            }
            if (!temp.isEmpty()) {
                words[w++] = temp;
            }
        }

        return Arrays.copyOf(words, w);
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtIn = text.split(" ");

        System.out.println(Arrays.toString(custom));
        System.out.println(Arrays.toString(builtIn));
        System.out.println(compareArrays(custom, builtIn));
    }
}

