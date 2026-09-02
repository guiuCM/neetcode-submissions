class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> complementos = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int numActual = nums[i];
            
            if (complementos.containsKey(numActual)) {
                return new int[]{complementos.get(numActual), i};
            }
            
            int necesito = target - numActual;
            complementos.put(necesito, i);
        }
        
        return new int[]{};
    }
}