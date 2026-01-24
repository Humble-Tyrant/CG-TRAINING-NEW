package CapgeminiCodingQuestions;

public class RemoveSpecialCharactersFromString {
    static String removeSpecialCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeSpecialCharacters("ab%$^&*cdE___"));
    }
}
