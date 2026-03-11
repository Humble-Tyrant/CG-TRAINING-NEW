public class RemoveDuplicatesInArray {
    int[] removeDuplicates(int[] arr){
        int n=arr.length;
        if(n==0) return new int[0];
        int[] temp=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }
        }
        temp[j++]=arr[n-1];
        int[] result=new int[j];
        System.arraycopy(temp,0,result,0,j);
        return result;
    }
    public static void main(String[] args) {
        RemoveDuplicatesInArray rdia=new RemoveDuplicatesInArray();
        int[] inputArray={1,1,2,2,3,3};
        int[] outputArray=rdia.removeDuplicates(inputArray);
        for(int num:outputArray){
            System.out.print(num+" ");
        }
    }

}
