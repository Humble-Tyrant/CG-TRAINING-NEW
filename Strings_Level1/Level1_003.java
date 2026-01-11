package Strings_Level1;
import java.util.Arrays;
import java.util.Scanner;
public class Level1_003 {
    static char[] toCharacterArr(String s){
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++)
            arr[i] = s.charAt(i);
        return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char[] arr = toCharacterArr(s);
        char[] arr2 = s.toCharArray();
        for(char c : arr){
            System.out.print(c+" ");
        }
        System.out.println();
        for(char c : arr2){
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println("Are both char array on same location ? "+ ((arr==arr2)?"Yes":"No"));
        System.out.println("Do both char arrays have equal value ? "+ (Arrays.equals(arr,arr2)?"Yes":"No"));
    }
}
