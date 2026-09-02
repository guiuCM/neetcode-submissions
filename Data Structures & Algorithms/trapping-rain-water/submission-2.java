class Solution {
    public int trap(int[] height) {
        if(height == null || height.length < 3) return 0;

        int len = height.length;
        int[] maxR = new int[len];
        int[] maxL = new int[len];
        int[] minmax = new int[len];
        int max = 0;

        //La clau és saber que cada lloc hi ha quantitat H2O = min(maxR, maxL) - height[i]
        //recórrer array maxL
        for(int i = 0; i < len; ++i){
            maxL[i] = max;
            if(height[i] > max) max = height[i];
        }

        max = 0;
        //recórrer array maxR
        for(int i = len-1; i >= 0; --i){
            maxR[i] = max;
            if(height[i] > max) max = height[i];
        }


        //recórrer array minmax
        for(int i = 0; i < len; ++i){
            minmax[i] = Math.min(maxL[i], maxR[i]);
        }


        int cont = 0;
        //recórrer array final calculant la solució
        for(int i = 0; i < len; ++i){
            if(minmax[i]-height[i] > 0){
                cont += minmax[i]- height[i];
            }
        }

        return cont;
    }
}
