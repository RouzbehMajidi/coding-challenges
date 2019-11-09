class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        values = set()
        
        for num in nums:
            if num in values:
                return True
            else:
                values.add(num)
        
        return False
        