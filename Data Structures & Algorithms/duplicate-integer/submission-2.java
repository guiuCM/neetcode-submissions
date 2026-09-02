class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set <Integer> contValues = new HashSet<>();
        for(int i = 0; i < nums.length; ++i){
            if (contValues.contains(nums[i])){
                return true;
            }
            else{
                contValues.add(nums[i]);
            }
        }
        return false;
    }
}