public class RemoveDuplicates {
    String removeDuplicates(String s){
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(sb.indexOf(String.valueOf(c))==-1){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        RemoveDuplicates rd=new RemoveDuplicates();
        String inputString="aabbcc";
        System.out.println(rd.removeDuplicates(inputString));
    }

}
