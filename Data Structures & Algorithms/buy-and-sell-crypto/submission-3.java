class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;

        int i = 0; // buy
        int j = 1; // sell
        int maxProfit = 0;

        while (j < prices.length) {
            // Si el preu actual és menor que el nostre preu de compra...
            if (prices[j] < prices[i]) {
                i = j;
            } else {
                int currentProfit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, currentProfit);
            }
            
            j++;
        }

        return maxProfit;
    }
}