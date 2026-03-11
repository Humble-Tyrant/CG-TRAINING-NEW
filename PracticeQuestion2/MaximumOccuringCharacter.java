public class MaximumOccuringCharacter {
    char maximumOccuringCharacter(String s){
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int maxFreq=0;
        char maxChar='a';
        for(int i=0;i<26;i++){
            if(freq[i]>maxFreq){
                maxFreq=freq[i];
                maxChar=(char)(i+'a');
            }
        }
        return maxChar;
    }
    public static void main(String[] args) {
        MaximumOccuringCharacter moc=new MaximumOccuringCharacter();
        String inputString="abcdd";
        System.out.println(moc.maximumOccuringCharacter(inputString));
    }

}
