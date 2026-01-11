package CapgeminiCodingQuestions;

import java.util.Scanner;

public class CheckPangram {
    static boolean isPangram(String s){
        String checker="aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
        for(int i=0;i<checker.length()-1;i=i+2){
            if((s.indexOf(checker.charAt(i))==-1)&&(s.indexOf(checker.charAt(i+1))==-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print(isPangram("AbCdEfGhIjKlMnOpQrStUvWxYz"));
    }
}

