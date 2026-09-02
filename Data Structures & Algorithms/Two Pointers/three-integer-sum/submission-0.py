class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        i,j,k =  0,1,2
        res = []
        repes = {}

        #ordenar per trobar repetits
        nums = sorted(nums)

        while i < len(nums)-2:

            j = i +1
            while j < len(nums)-1:

                k = j + 1
                while k < len(nums):
                    if nums[i]+nums[j]+nums[k] == 0:
                        n = [nums[i],nums[j],nums[k]]

                        if tuple(n) not in repes:
                            repes[tuple(n)] = 1
                            res.append(n)

                    k += 1

                j += 1

            i += 1

        return res
