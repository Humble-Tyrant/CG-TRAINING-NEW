package CodingQuestions;

import java.util.Arrays;

public class RotateArrayLeftOrRight {
    static void reverse(int[] array,int start,int end){

        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

    }
    static void rotateArray(int[] arr, int k,String direction) {
        if (arr == null || arr.length == 0 || k < 0 || k > arr.length) {
            return;
        }
        k=k%arr.length;
        if (direction.equals("right")) {
            reverse(arr,0,arr.length-k-1);
            reverse(arr,arr.length-k,arr.length-1);
            reverse(arr,0,arr.length-1);
        }
        else if (direction.equals("left")) {
            reverse(arr,0,k-1);
            reverse(arr,k,arr.length-1);
            reverse(arr,0,arr.length-1);
        }
        else {
            System.out.println("Enter valid direction,either right or left");
            return;
        }

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] arr1= new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] arr2= new int[]{1,2,3,4,5,6,7,8,9,10};
        String direction = "right";
        String direction2 = "left";
        String direction3 = "up";
        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));
        System.out.println("Left Rotation Array");
        rotateArray(arr,3,direction2);
        System.out.println(Arrays.toString(arr));
        System.out.println("Right Rotation Array");
        rotateArray(arr1,3,direction);
        System.out.println(Arrays.toString(arr1));
        System.out.println("Wrong Direction Array");
        rotateArray(arr2,3,direction3);
        System.out.println(Arrays.toString(arr2));



    }
}
