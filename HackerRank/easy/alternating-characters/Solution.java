public class Solution {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        if(s.length() == 0){
            return 0;
        }

        int deletionCount = 0;

        for(int i = 1; i < s.length(); i ++){
            if(s.charAt(i) == s.charAt(i-1)){
                deletionCount ++;
            }
        }

        return deletionCount;

    }
    
}