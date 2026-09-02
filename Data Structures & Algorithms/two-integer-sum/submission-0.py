class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        sol = {}  # dictionary: value -> index

        for i, num in enumerate(nums):
            x = target - num

            if x in sol:  # check if complement exists
                return [sol[x], i]

            sol[num] = i  # store current number and its index

        return []