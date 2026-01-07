package Arrays_Level1;
import java.util.*;
public class Level1_001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] ageOfStudents=new int[10];
        for(int i =0;i<ageOfStudents.length;i++){
            ageOfStudents[i]=sc.nextInt();
        }
        for(int i:ageOfStudents){
            if(i<0){
                System.out.println("Invalid Age");
            }
            else{
                if(i>=18){
                    System.out.println("The student with the age " +i+" can vote");
                }
                else{
                    System.out.println("The student with the age " +i+" cannot vote");
                }
            }
        }
        sc.close();
    }
}
