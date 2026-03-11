public class DecodeBinaryString {
    String decodeBinaryString(String s){
        StringBuilder sb=new StringBuilder();
        String[] arr=s.split("0");
        for(String str:arr){
            if(!str.isEmpty()){
                int n=str.length();
                char c=(char)(n+'A'-1);
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        DecodeBinaryString dbs=new DecodeBinaryString();
        String binaryString="101101110";
        System.out.println(dbs.decodeBinaryString(binaryString));
    }

}
