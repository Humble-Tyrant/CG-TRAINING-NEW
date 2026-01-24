package CodingQuestions;
import java.util.Scanner;
public class ReverseWords {
    static String reverseWords(String str) {
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String a:arr){
            sb.append(new StringBuilder(a).reverse());
            sb.append(' ');
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(reverseWords(str));
        input.close();
    }
}
