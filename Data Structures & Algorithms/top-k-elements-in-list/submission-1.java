class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // 2. Create the buckets. 
        // Array size is nums.length + 1 because the max frequency a number can have is nums.length
        List<Integer>[] buckets = new List[nums.length + 1];
        
        for (int key : count.keySet()) {
            int frequency = count.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            // Place the number into the bucket corresponding to its frequency
            buckets[frequency].add(key);
        }

        // 3. Gather the top k elements by reading the buckets backwards (highest frequency to lowest)
        int[] result = new int[k];
        int index = 0;
        
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[index++] = num;
                    // Stop once we have collected exactly k elements
                    if (index == k) {
                        return result;
                    }
                }
            }
        }
        
        return result;
    }
}
