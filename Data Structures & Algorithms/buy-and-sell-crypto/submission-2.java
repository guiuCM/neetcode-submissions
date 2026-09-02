class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;

        int i = 0; // El nostre punter de COMPRA (esquerra)
        int j = 1; // El nostre punter de VENDA (dreta)
        int maxProfit = 0;

        while (j < prices.length) {
            // Si el preu actual és menor que el nostre preu de compra...
            if (prices[j] < prices[i]) {
                i = j; // TRUC: Movem la compra directament al nou mínim trobat!
            } else {
                // Si és més car, calculem el benefici potencial d'avui
                int currentProfit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, currentProfit);
            }
            
            j++; // La venda sempre avança un pas per mirar el següent dia
        }

        return maxProfit;
    }
}