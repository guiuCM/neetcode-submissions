class Solution {
    char[][] grid;
    public int numIslands(char[][] grid) {
        this.grid = grid;
        int sum = 0;
        for(int i = 0; i < grid.length; ++i){
            for(int j = 0; j < grid[0].length; ++j){
                if(grid[i][j] == '1'){
                    bfs(i,j);
                    sum += 1;
                }
            }
        }
        return sum;
    }

    private void bfs (int i, int j){
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});

        while(!q.isEmpty()){

            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            grid[r][c] = '0';

            if(valid (r+1, c)) q.offer(new int[]{r+1, c});
            if(valid (r-1, c)) q.offer(new int[]{r-1, c});
            if(valid (r, c+1)) q.offer(new int[]{r, c+1});
            if(valid (r, c-1)) q.offer(new int[]{r, c-1});
            
        }

    }

    private boolean valid(int i, int j){
        return i < grid.length && i >= 0 && j < grid[0].length && j >= 0 && grid[i][j] == '1';
    }
}
