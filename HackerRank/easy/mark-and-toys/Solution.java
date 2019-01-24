public class Solution {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
            Arrays.sort(prices);
            int numberOfToys = 0;
            int currentCost = 0;

            while(currentCost < k){

                if (currentCost + prices[numberOfToys] <= k){
                    currentCost = currentCost + prices[numberOfToys];
                    numberOfToys ++;
                }else{
                    break;
                }
            }

            return numberOfToys;
    }
}