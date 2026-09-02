class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Map<Integer, Integer> contValues = new HashMap<>();

        for(int i = 0; i < nums.length; ++i){
            if (contValues.containsKey(nums[i])){
                return true;
            }
            else{
                contValues.put(nums[i], 1);
            }
        }
        return false;
    }
}