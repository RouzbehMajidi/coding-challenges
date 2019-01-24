public class Solution {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        HashMap<Integer, Integer> iceCreams = new HashMap<Integer,Integer>();

        for(int i = 0; i < cost.length; i++){
        
            Integer otherIceCream = iceCreams.get(cost[i]);

            if(otherIceCream != null){
                //Found match
                System.out.println( otherIceCream + " " + (i + 1));
                return;
            }else{
                    Integer priceComplement = money - cost[i];
                iceCreams.put(priceComplement, (i + 1));
            }

        }

    }
}