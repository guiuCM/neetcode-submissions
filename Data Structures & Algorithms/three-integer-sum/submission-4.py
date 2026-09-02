class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []
        
        for i in range(len(nums)):
            # Evitamos duplicados fara el primer numero
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            target = -nums[i]
            self.twoSum(nums, i + 1, len(nums) - 1, target, res, nums[i])
            
        return res

    # Adaptamos tu función para que trabaje sobre la lista 'res' directamente
    def twoSum(self, nums: List[int], l: int, r: int, target: int, res: List[List[int]], first_val: int):
        while l < r:
            value = nums[l] + nums[r]
            
            if value == target:
                res.append([first_val, nums[l], nums[r]])
                l += 1
                r -= 1
                # Evitamos duplicados para el segundo número
                while l < r and nums[l] == nums[l - 1]:
                    l += 1
            elif value < target:
                l += 1
            else:
                r -= 1