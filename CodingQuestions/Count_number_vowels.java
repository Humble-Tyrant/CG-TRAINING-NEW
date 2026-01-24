package CodingQuestions;
import java.util.Scanner;
public class Count_number_vowels {
    static int countVowels(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int countVowels = countVowels(s);
        System.out.println(countVowels);
        input.close();
    }
}
