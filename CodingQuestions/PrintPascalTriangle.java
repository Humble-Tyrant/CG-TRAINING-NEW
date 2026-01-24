package CapgeminiCodingQuestions;

public class PrintPascalTriangle {
    static void printPascalTriangle(int n){
        if(n==0){
            return;
        }
        if(n==1){
            System.out.print(1);
        }
        int ans=1;
        System.out.println(ans);
        for(int i=2;i<=n;i++){
            System.out.print(ans+"\t");
            for(int j=1;j<i;j++){

                ans*=(i-j+1);
                ans/=(j);
                System.out.print(ans+"\t");
            }
            ans=1;
            System.out.print(ans+"\t");
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printPascalTriangle(5);
    }
}
