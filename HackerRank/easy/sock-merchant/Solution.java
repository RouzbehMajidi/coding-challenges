public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
            HashSet<Integer> unmatchedSocks = new HashSet<Integer>();

            int totalPairs = 0;

            for(int sock : ar){
                if(unmatchedSocks.contains(sock)){
                    totalPairs ++;
                    unmatchedSocks.remove(sock);
                }else{
                    unmatchedSocks.add(sock);
                }
            }
        
            return totalPairs;
    }

}