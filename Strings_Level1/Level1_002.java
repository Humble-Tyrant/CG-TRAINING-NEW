package Strings_Level1;
import java.util.Objects;
import java.util.Scanner;
public class Level1_002 {
    static String substr(String s, int k, int l) {
        if (l == 0)
            return "";
        if(l>=s.length()){
            return "Index out of bounds";
        }
        String ans= "";
        for(int i=k;i<l;i++){
            ans+=s.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int k = input.nextInt();
        int l = input.nextInt();
        String s1=substr(s,k,l);
        String s2=s.substring(k,l);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("Are both strings on same location ? "+ ((s1==s2)?"Yes":"No"));
        System.out.println("Do both strings have equal value ? "+ (s1.equals(s2)?"Yes":"No"));
        input.close();


    }
}
