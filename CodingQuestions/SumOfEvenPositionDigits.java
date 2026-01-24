package CapgeminiCodingQuestions;

public class SumOfEvenPositionDigits {
    static int sumEvenPositionDigits(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i=i+2){
            sum+=nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,8,9};
        System.out.println(sumEvenPositionDigits(nums));
    }
}
