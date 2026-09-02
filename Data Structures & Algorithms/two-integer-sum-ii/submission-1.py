class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        
        res = []
        for i in range (len(numbers)-1):
            j = i + 1

            while j < len(numbers):
                if numbers[i]+numbers[j] == target:
                    res.append(i+1)
                    res.append(j+1)
                    break
                j += 1
        
        return res

           