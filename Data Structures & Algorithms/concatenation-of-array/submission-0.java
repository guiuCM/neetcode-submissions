class Solution {
    public int[] getConcatenation(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0];

        int len = nums.length;
        int[] ans = new int[2*len];

        for(int i = 0; i < len; ++i){
            ans[i] = nums[i];
            ans[i + len] = nums[i];
        }

        return ans;

    }
}