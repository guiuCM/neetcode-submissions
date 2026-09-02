class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        s = {} #conta la freq de cada num
        
        for num in nums:

            if num in s:
                s[num] += 1
            else:
                s[num] = 1
        
        sorted_by_values = sorted(s.items(), key=lambda item: item[1], reverse=True)
        
        #Agafa ells primers k elements
        sol = [item[0] for item in sorted_by_values[:k]]

        return sol
