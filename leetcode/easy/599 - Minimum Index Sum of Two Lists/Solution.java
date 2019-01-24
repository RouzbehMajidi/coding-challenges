class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> restuarants = new HashMap<String,Integer>();
        
        for(int i = 0; i < list1.length; i ++){
            restuarants.put(list1[i], i);
        }
           
        String bestRestuarant = "";
        ArrayList<String> additionalBestResturants = new ArrayList<String>();
        int bestRestuarantIndexSum = Integer.MAX_VALUE;
        
        for(int i = 0; i < list2.length; i ++){
            Integer restuarantIndex = restuarants.get(list2[i]);
            
            if(restuarantIndex != null){
                int restuarantIndexSum = restuarantIndex + i;
                if (restuarantIndexSum < bestRestuarantIndexSum){
                    bestRestuarantIndexSum = restuarantIndexSum;
                    bestRestuarant = list2[i];
                    additionalBestResturants.clear();
                }else if(restuarantIndexSum == bestRestuarantIndexSum){
                    additionalBestResturants.add(list2[i]);
                }
            }
        }
        
        additionalBestResturants.add(bestRestuarant);
        
        return additionalBestResturants.toArray(new String[0]);
    
    }
}