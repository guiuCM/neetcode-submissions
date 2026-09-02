class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        count = {}

        for i, num in enumerate(nums):

            if num in count:
                return [count[num], i]
            
            need = target - num
            count[need] = i
        
        return []