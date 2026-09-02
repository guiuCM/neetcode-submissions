class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null) return new int[0];
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; ++i ){
            result[i] = product(nums, i);
        }

        return result;
    }

    private int product(int[] nums, int idx){

        int sum = 1;
        for(int i = 0; i < nums.length; ++i ){
            if (i != idx) sum *= nums[i];
        }
        
        return sum;
    }


}  
