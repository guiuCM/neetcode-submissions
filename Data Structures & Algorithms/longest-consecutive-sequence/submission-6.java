class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        Arrays.sort(nums);

        int max = 0;
        int actual = 1;
        

        for(int i = 1; i < nums.length; ++i){

            int prev = nums[i-1];

            if(nums[i] == prev+1) ++actual;
            else if(nums[i] == prev) continue;
            else{
                max = Math.max(actual, max);
                actual = 1;
            }
        }

        max = Math.max(actual, max);
        return max;
    }
}
