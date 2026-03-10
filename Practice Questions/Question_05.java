public class Question_05 {
    int defOfSum(int n,int m){
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=m;i++){
            if(i%n==0) sum2+=i;
            else sum1+=i;
        }
        return sum1-sum2;
    }

    static void main(String[] args) {
        Question_05 q = new Question_05();
        System.out.println(q.defOfSum(4,20));
    }
}
