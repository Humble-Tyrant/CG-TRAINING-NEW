public class PalindromeCount {
    private static boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    int palindromeCount(String s){
        int count=0;
        String[] arr=s.split(" ");
        for(String str:arr){
            if(isPalindrome(str)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        PalindromeCount pc=new PalindromeCount();
        String input="madam racecar level hello world";
        System.out.println(pc.palindromeCount(input));
    }
                

}
