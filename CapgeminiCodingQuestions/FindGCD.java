package CapgeminiCodingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class FindGCD {
    static int[] gcd(int a,int b){
        int a1=a;
        int b1=b;
        while(b1!=0){
            int temp=b1;
            b1=a1%b1;
            a1=temp;
        }
        int lcm=a*b/a1;
        return new int[]{lcm,a1};

    }
    public static void main(String args[]){
        int[] arr=gcd(12,8);
        System.out.println(Arrays.toString(arr));
    }
}
