class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        // Max-Heap: posa a dalt de tot el punt amb major distància (b - a)
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> 
            (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
        );

        for (int[] point : points) {
            maxHeap.offer(point);
            // Quan superem k, traiem el punt més allunyat
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Bolquem els k punts restants a la matriu de sortida
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
}