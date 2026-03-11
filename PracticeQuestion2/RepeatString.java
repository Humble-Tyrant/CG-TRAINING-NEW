public class RepeatString {
    String repeatString(int n,String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(s);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        RepeatString rs=new RepeatString();
        System.out.println(rs.repeatString(3,"abc"));
    }
}
