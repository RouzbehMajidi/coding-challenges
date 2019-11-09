class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> values = new HashMap<Integer,Integer>();
        
        int[] toReturn = new int[2];
        
        for(int i = 0; i < nums.length; i++) {
            
            Integer remainderIndex = values.get(target - nums[i]);
            
            if(remainderIndex != null) {
                toReturn  = new int[]{remainderIndex,i};
                break;
            }else{
                values.put(nums[i],i);
            }
                
        }
        
        return toReturn;
    }
}