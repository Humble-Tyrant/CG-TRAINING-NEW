package CodingQuestions;

public class PrimeNumberInRange {
    static boolean isPrime(int n){
        for (int i=2;i<=(int)Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    static String getPrimes(int k,int l){
        StringBuilder sb=new StringBuilder();
        for(int i=k;i<l;i++){
            if(i==0 || i==1 ) continue;
            if(isPrime(i)){
                sb.append(i).append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(getPrimes(0,10));
    }
}
