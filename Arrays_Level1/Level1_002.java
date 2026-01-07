package Arrays_Level1;

import java.util.Scanner;

public class Level1_002 {
    void getNumberSign(int a){
        if (a==0){
            System.out.println("The number is zero");
        }
        else if (a>0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
    }
    void determineEvenOdd(int a){
        if(a>0){
            if (a%2==0){
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is odd");
            }
        }
    }
    void compareExtremes(int[] arr){
        if (arr[0]>arr[arr.length-1]){
            System.out.println("The number "+arr[0]+" is greater than "+arr[arr.length-1]);
        }
        else if (arr[0]==arr[arr.length-1]){
            System.out.println("The number "+arr[0]+" is equal to "+arr[arr.length-1]);
        }
        else{
            System.out.println("The number "+arr[0]+" is less than "+arr[arr.length-1]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr=new int[5];
        Level1_002 obj=new Level1_002();
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for (int j : arr) {
            obj.getNumberSign(j);
        }
        for (int j : arr) {
            obj.determineEvenOdd(j);
        }
        obj.compareExtremes(arr);

        input.close();

    }
}
