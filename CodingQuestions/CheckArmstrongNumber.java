package CodingQuestions;

public class CheckArmstrongNumber {
    static boolean checkArmstrongNumber(int n){
        int temp=n;
        int sum=0;
        int digits = String.valueOf(n).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum+= (int) Math.pow(digit,digits);
            temp/=10;
        }
        return sum==n;
    }
    public static void main(String[] args) {
        System.out.println(checkArmstrongNumber(123));
    }
}
