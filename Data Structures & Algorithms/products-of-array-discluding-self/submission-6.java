public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] sol = new int[len];

        sol[0] = 1;
        for (int i = 1; i < len; ++i) {
            sol[i] = sol[i - 1] * nums[i - 1];
        }

        int postfix = 1;
        for (int i = len - 1; i >= 0; --i) {
            sol[i] = sol[i] * postfix;
            postfix *= nums[i];
        }

        return sol;
    }
}