class Solution {
     public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0) return 0;

        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        // El array visited ya empieza en false por defecto en Java
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    bfs(grid, visited, i, j);
                }
            }
        }

        return count;
    }

    public void bfs(char[][] grid, boolean[][] visited, int i, int j){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        visited[i][j] = true;

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty()){
            int[] current = queue.poll();

            for (int[] dir : directions) {
                int nextR = current[0] + dir[0];
                int nextC = current[1] + dir[1];

                // Verificamos: límites del mapa, si es tierra y si no fue visitado
                if (nextR >= 0 && nextR < grid.length &&
                        nextC >= 0 && nextC < grid[0].length &&
                        grid[nextR][nextC] == '1' && !visited[nextR][nextC]) {

                    visited[nextR][nextC] = true; // MARCAR ANTES DE AÑADIR (evita duplicados)
                    queue.add(new int[]{nextR, nextC});
                }
            }

        }
    }
}
