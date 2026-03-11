public class CaesarCipher {
    String caesarCipher(String s,int k){
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                sb.append((char)((c-'A'+k)%26+'A'));
            }else if(Character.isLowerCase(c)){
                sb.append((char)((c-'a'+k)%26+'a'));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        CaesarCipher cc=new CaesarCipher();
        String inputString="nrfzh";
        int shift=3;
        System.out.println(cc.caesarCipher(inputString, shift));
    }

}
