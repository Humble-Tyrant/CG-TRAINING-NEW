package Strings_Level2;

import java.util.Scanner;
import java.util.Arrays;

class Level2_003 {

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

        String[] words = new String[wordCount];
        int index = 0;
        String temp = "";

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else if (!temp.equals("")) {
                words[index++] = temp;
                temp = "";
            }
        }

        if (!temp.equals("")) {
            words[index] = temp;
        }

        return words;
    }

    static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] table = wordWithLength(words);

        for (int i = 0; i < table.length; i++) {
            System.out.println(
                    table[i][0] + "\t" + Integer.parseInt(table[i][1])
            );
        }
    }
}

