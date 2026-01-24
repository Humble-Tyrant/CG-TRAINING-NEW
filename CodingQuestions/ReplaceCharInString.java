package CodingQuestions;

public class ReplaceCharInString {
    static String replaceCharInString(String s, char c){
        s=s.replaceAll(" ",""+c);
        return s;
    }
    public static void main(String[] args) {
        System.out.println(replaceCharInString("ab c de   fg",'A'));
    }
}
