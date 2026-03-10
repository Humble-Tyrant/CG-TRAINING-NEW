public class Question_02 {
    public int OperationsBinaryString(String str){
        int ans=str.charAt(0)-'0';
        for(int i=1;i<str.length()-1;i=i+2){
            char ch=str.charAt(i);
            int ch1=str.charAt(i+1)-'0';
            if(ch=='A'){
                ans=ans&ch1;
            }
            else if(ch=='B'){
                ans=ans|ch1;
            }
            else if(ch=='C'){
                ans=ans^ch1;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(new Question_02().OperationsBinaryString("1C0C1C1A0B1"));
    }
}
