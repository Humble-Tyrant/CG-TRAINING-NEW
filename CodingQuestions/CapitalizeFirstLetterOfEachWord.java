package CodingQuestions;

public class CapitalizeFirstLetterOfEachWord {
    static String capitalizeFirstLetter(String str) {
        String[] ar=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String s:ar){
            sb.append(s.substring(0,1).toUpperCase()).append(s.substring(1)).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(capitalizeFirstLetter("hello how are you ?; i am not Good"));
    }
}
