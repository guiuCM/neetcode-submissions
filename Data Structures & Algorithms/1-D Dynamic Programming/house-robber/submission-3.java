class Solution {
    public int rob(int[] nums) {
        
        //To improve these problems you can store the only two last elements in variables to get constant space O(1)
        if(nums == null || nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }

        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; ++i ){
            int temp = Math.max(second, first + nums[i]);
            first = second;
            second = temp;
        }

        return second;
    }
}
