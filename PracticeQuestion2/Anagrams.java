public class Anagrams {
    String isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return "NO";
        }
        int[] freq=new int[26];
        for(char c:s1.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:s2.toCharArray()){
            freq[c-'a']--;
        }
        for(int i:freq){
            if(i!=0){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Anagrams anagrams=new Anagrams();
        String s1="listen";
        String s2="silent";
        System.out.println(anagrams.isAnagram(s1, s2));    
    }

}
