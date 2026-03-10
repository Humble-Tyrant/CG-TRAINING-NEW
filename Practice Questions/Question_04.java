public class Question_04 {
    int findCount(int[] arr,int n,int num,int diff){
        int count=-1;
        for(int i=0;i<n;i++){
            if(Math.abs(arr[i]-num)<=diff){
                count++;
            }
        }
        return (count>0)?count+1:-1;
    }

    static void main(String[] args) {
        Question_04 q = new Question_04();
        int[] arr = {12,3,14,56,77,13};
        System.out.println(q.findCount(arr,arr.length,13,2));
    }
}
