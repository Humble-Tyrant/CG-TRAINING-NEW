package CodingQuestions;

public class FibonacciSeries {
    static void createFibonacciSeries(int n){
        int a=0;
        int b=1;
        int[] arr=new int[n];
        arr[0]=a;
        arr[1]=b;
        for(int i=2;i<n;i++){

            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        createFibonacciSeries(10);
    }
}
