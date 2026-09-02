public class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Opció amb array: [distància, x, y]
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));

        for (int[] point : points) {
            int dist = point[0] * point[0] + point[1] * point[1];
            maxHeap.offer(new int[]{dist, point[0], point[1]});

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // En extreure'ls, recuperes només [x, y]
        int[][] res = new int[k][2];
        int i = 0;
        while (!maxHeap.isEmpty()) {
            int[] item = maxHeap.poll();
            res[i++] = new int[]{item[1], item[2]};
        }

        return res;
    }
}