public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        
        int r = piles[0];
        for (int p : piles) {
            if (p > r) {
                r = p;
            }
        }

        int res = r;

        //fem una cerca vinaria amb els possibles resultats desde 1 fins al maxim valor de piles.length i anem comprobant per cada un si és possible fins a trobar la millor solució.
        while (l <= r) {
            int k = (l + r) / 2;

            long totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / k);
            }
            if (totalTime <= h) {
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
        }
        return res;
    }
}