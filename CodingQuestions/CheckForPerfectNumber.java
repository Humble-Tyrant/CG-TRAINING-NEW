package CodingQuestions;

public class CheckForPerfectNumber {
    static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum+=i;
                int otherDivisor = number / i;
                if (otherDivisor != i) {
                    sum += otherDivisor;
                }
            }

        }
        return sum == number;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(10));
    }
}
