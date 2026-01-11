package CapgeminiCodingQuestions;

public class secondLargestElement {
    static int findSecondLargest(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];

            }
            else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,10,9,10};
        System.out.println(findSecondLargest(arr));

    }
}
