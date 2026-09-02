class Solution {
    public int findMin(int[] nums) {
        if(nums == null) return 0;

        int l = 0;
        int r = nums.length-1;
        int min = nums[0];
        boolean permut = false;

        if (nums[r] <= nums[l]) {
            permut = true;
        }

        while(l <= r){
            int mid = (l+r) / 2;
            if(nums[mid] < min) min = nums[mid];
            if (permut){
                //algorisme modificat cap amunt
                if(nums[mid] > nums[r]){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
            else{
                //min és el primer
                return nums[0];
            }
        }

        return min;
    }
}
