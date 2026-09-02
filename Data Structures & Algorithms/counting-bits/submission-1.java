class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        
        // res[0] is automatically 0 in Java, so we start the loop at 1
        for (int i = 1; i <= n; i++) {
            // bits in current number = bits in (i / 2) + (1 if odd, 0 if even)
            res[i] = res[i >> 1] + (i & 1);
        }
        
        return res;
    }
}