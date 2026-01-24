package CodingQuestions;

public class ConvertBinary {
    static String convertBinary(int num) {

        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (num != 0) {

            sb.append(num % 2);
            num /= 2;
        }
        return sb.reverse().toString();
    }
    static int convertDecimal(String num) {
        int sum=0;
        int power=0;
        for(int i=num.length()-1;i>=0;i--){
            int digit = num.charAt(i) - '0';
            sum+=digit*(int)Math.pow(2,power);
            power++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int a=100;
        String str=convertBinary(a);
        System.out.println(str);
        System.out.println(convertDecimal(str));

    }
}
