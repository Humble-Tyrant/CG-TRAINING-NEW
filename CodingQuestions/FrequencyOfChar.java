package CapgeminiCodingQuestions;

import java.util.HashMap;

public class FrequencyOfChar {
    static String frequencyOfChar(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        StringBuilder sb=new StringBuilder();
        for(char c:map.keySet()){
            sb.append(c).append(map.get(c));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="aabaab";
        System.out.println(frequencyOfChar(str));
    }
}
