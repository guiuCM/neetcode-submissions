class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complemento = new HashMap<>();
        int[] sol = new int[2];

        for(int i = 0; i < nums.length; ++i){
            int value = nums[i];
            if(complemento.containsKey(value)){
                sol[0] = complemento.get(value);
                sol[1] = i;
                return sol;
            }
            complemento.put(target-value, i);
        }
        return sol;
    }
}