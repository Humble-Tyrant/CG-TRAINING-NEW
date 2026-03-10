public class Question_01 {
    public int houseRat(int r, int unit, int[] arr){
        if(arr==null){return -1;}
        int ans=r*unit;
        for(int i=0;i<arr.length;i++){
            ans=ans-arr[i];
            if(ans<=0) return i+1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr={2,8,3,5,7,4,1,2};
        System.out.println(new Question_01().houseRat(7,2,arr));
    }
}
