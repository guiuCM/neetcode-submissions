class Solution {
    public int maxProfit(int[] prices) {

       if (prices == null || prices.length < 2) return 0;

        int l = 0;
        int r = 1;
        int maxProfit = 0;

        while(r < prices.length){
            //Si hi ha profit
            if(prices[l] < prices[r]){
                //mirar si hem aconseguit un profit major
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(profit, maxProfit);
                r += 1;
            }
            //Sinó
            else{
                //actualitzar nou mínim
                l = r;
                r +=1;
            }
        }

        return maxProfit;
    }
}
