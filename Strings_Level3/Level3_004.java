package Strings_Level3;

import java.util.Scanner;

class Level3_004 {

    static String[][] findCharFrequency(String text) {
        int[] freq = new int[256];
        int length = 0;

        try {
            while (true) {
                char ch = text.charAt(length);
                freq[ch]++;
                length++;
            }
        } catch (RuntimeException e) {
        }

        int count = 0;
        boolean[] visited = new boolean[256];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (!visited[ch]) {
                count++;
                visited[ch] = true;
            }
        }

        String[][] result = new String[count][2];
        int index = 0;
        visited = new boolean[256];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (!visited[ch]) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                visited[ch] = true;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] table = findCharFrequency(text);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }
}

