public class PushZeroesToEnd {
    int[] pushZeroesToEnd(int n,int[] a){
        int[] result=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                result[index++]=a[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        PushZeroesToEnd pzte=new PushZeroesToEnd();
        int[] inputArray={0,1,0,3,12};
        int[] outputArray=pzte.pushZeroesToEnd(5,inputArray);
        for(int num:outputArray){
            System.out.print(num+" ");
        }
    }

}
