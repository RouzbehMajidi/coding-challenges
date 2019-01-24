class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i ++){
            int index = Math.abs(nums[i]) - 1;
            nums[index] = -1*nums[index];
            
            if(nums[index] > 0){
                duplicates.add(index + 1);
            }
        }
        
        return duplicates;
        
    }
}