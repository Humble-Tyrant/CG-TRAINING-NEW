public class HikeTrial {
    int hikeTrial(int n,int[] a){
        int count=0;
        for(int i=0;i<n-1;i++){
            if(a[i+1]>a[i]){
                count++;
            }
        }
        return a[count];
    }
    public static void main(String[] args) {
        HikeTrial ht=new HikeTrial();
        int[] a={1,2,3,4,3,2,1};
        System.out.println(ht.hikeTrial(7,a));
    }
}
