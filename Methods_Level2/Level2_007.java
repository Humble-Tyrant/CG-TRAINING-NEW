package Methods_Level2;
import java.util.Scanner;
public class Level2_007 {
    public class StudentVoteChecker{
        public boolean canStudentVote(int age){
            if(age<0 || age<18){
                return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Level2_007 obj = new Level2_007();
        StudentVoteChecker obj2= obj.new StudentVoteChecker();
        int[] studentAge = new int[10];
        for(int i = 0; i<studentAge.length; i++){
            studentAge[i] = sc.nextInt();
        }
        for (int j : studentAge) {
            System.out.println(obj2.canStudentVote(j));
        }
        sc.close();
    }
}
