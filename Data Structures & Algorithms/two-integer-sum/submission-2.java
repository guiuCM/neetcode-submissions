class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map <Integer, Integer> numToIndex = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];

      if (numToIndex.containsKey(complement)) {
       int[] result = new int[2];
        result[0] = numToIndex.get(complement);
        result[1] = i;
        return result;
      }

      numToIndex.put(nums[i], i);
    }

    return null; // o throw new IllegalArgumentException("No two sum solution");
  }
}
