class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        return count.size() != nums.length;
    }
}