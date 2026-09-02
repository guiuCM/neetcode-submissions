from typing import List

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        l, r = 0, len(matrix[0])*len(matrix)-1

        while r >= l:
            mid = (l+r) // 2
            midr = mid // len(matrix[0])
            midc = mid % len(matrix[0])
            

            if matrix[midr][midc] == target:
                return True
            elif matrix[midr][midc] > target:
                r = mid -1
            elif matrix[midr][midc] < target:
                l = mid +1
        return False
    