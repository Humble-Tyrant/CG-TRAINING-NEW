package CapgeminiCodingQuestions;

import java.util.Arrays;

public class ReverseArray {
    static int[]  reverseArray(int[] array){
        int start = 0;
        int end = array.length-1;
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }return array;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }
}
