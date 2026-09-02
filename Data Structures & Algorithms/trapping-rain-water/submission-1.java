class Solution {
    public int trap(int[] heights) {
        if (heights == null || heights.length == 0) return 0;

        int left = 0;
        int right = heights.length - 1;
        
        // Muros máximos vistos hasta ahora
        int maxLeft = heights[left];
        int maxRight = heights[right];
        
        int totalWater = 0;

        while (left < right) {
            // Decidimos qué lado procesar. 
            // Siempre procesamos el lado que tiene el muro MÁXIMO histórico más bajo.
            if (maxLeft < maxRight) {
                left++;
                // Actualizamos el muro máximo izquierdo si encontramos uno más alto
                maxLeft = Math.max(maxLeft, heights[left]);
                // El agua atrapada es el muro máximo menos la altura actual
                // (Si la altura actual es mayor que el muro, esto dará 0)
                totalWater += maxLeft - heights[left];
            } else {
                right--;
                // Lo mismo para el lado derecho
                maxRight = Math.max(maxRight, heights[right]);
                totalWater += maxRight - heights[right];
            }
        }

        return totalWater;
    }
}