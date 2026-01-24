package CodingQuestions;
import java.util.*;
public class FindDuplicateElements {
    static ArrayList<Integer> findDuplicateElements(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(list.contains(arr[i])){
                ans.add(arr[i]);
            }
            else{
                list.add(arr[i]);
            }
        }
        return ans;


    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,3,4,4};
        ArrayList<Integer> brr  =findDuplicateElements(arr);
        System.out.println(brr);
    }
}
