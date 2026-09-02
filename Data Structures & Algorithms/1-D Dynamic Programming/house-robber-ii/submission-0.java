class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        // Caso 1: De la primera a la penúltima
        int opcion1 = robLineal(nums, 0, nums.length - 2);
        
        // Caso 2: De la segunda a la última
        int opcion2 = robLineal(nums, 1, nums.length - 1);

        return Math.max(opcion1, opcion2);
    }

    // Este es el House Robber 1 que ya aprendiste (optimizado en espacio)
    private int robLineal(int[] nums, int start, int end) {
        int prev2 = 0;
        int prev1 = 0;

        for (int i = start; i <= end; i++) {
            int current = Math.max(nums[i] + prev2, prev1);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
