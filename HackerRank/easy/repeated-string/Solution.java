public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long count = 0;
        long remainder = 0;
        long numberOfRepeats = n/s.length();
        long remainderRepeats = n % s.length();

         for(int i=0; i < s.length(); i ++){
             if(s.charAt(i) == 'a') {
                if (i < remainderRepeats){
                    remainder++;
                    count ++;
                }else {
                    count++;   
                }         
            }
         }

        return count*numberOfRepeats + remainder;

    }
}