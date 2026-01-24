package CapgeminiCodingQuestions;

public class RemoveVowels {
    static String removeVowels(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if("aeiouAEIOU".contains(""+str.charAt(i))){
                continue;
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="aabaabeEFgIoUc";
        System.out.println(removeVowels(str));
    }
}
