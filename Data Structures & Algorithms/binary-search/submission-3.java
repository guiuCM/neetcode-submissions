class Solution {
    public int search(int[] nums, int target) {
        if(nums == null) return -1;

        int l = 0, r = nums.length -1;
        
        while (l <= r){
            int mid = (l + r) / 2;

            if (nums[mid] == target) return mid;

            else if(nums[mid] > target){
                r -= 1;
            }

            else{
                l += 1;
            } 
        }

        return -1;
                    
    }
}
