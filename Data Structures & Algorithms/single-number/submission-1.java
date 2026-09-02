public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            //Xor per cada número i es van anul·lant els repetits
            res ^= num;
        }
        return res;
    }
}