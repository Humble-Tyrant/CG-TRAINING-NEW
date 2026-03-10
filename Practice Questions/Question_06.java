public class Question_06 {
    int evenOdd(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length-1;i=i+2){
            if(max<arr[i]) max=arr[i];
            if(min>arr[i+1]) min=arr[i+1];
        }
        return max+min;
    }

    static void main(String[] args) {
        Question_06 q = new Question_06();
        int[] arr = {3,2,1,7,5,4};
        System.out.println(q.evenOdd(arr));
    }
}
