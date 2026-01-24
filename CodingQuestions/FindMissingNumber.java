package CodingQuestions;

public class FindMissingNumber {
    static int findMissingNumber(int[] nums) {
        int xorAll = 0;
        int xorArr = 0;

        int n = nums.length + 1; // because one number is missing

        // XOR full range (1 to n)
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }

        // XOR array elements
        for (int x : nums) {
            xorArr ^= x;
        }

        return xorAll ^ xorArr;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,8,9};
        System.out.println(findMissingNumber(nums));

    }
}
