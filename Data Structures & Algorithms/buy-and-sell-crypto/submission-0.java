class Solution {
    public int maxProfit(int[] prices) {

       if (prices == null || prices.length < 2) return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // 1. Update the lowest price we've seen so far
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // 2. Calculate profit if we sold today and update global max
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}
