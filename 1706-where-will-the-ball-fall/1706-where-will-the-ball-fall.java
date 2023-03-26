class Solution {
    public int[] findBall(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans[] = new int[m];

        for(int j=0; j<m; j++){
            int curr = j; //column in which ball is currently at
            int next = -1; //column in which ball will go next 
            for(int i=0; i<n; i++){
                next = curr + grid[i][curr]; // we will move to next pos from curr pos so [i][curr]
                if(next<0 || next>=m || grid[i][curr]!=grid[i][next]){
                    curr = -1;
                    break;
                }
                curr = next;
            }           
            ans[j] = curr;
        }
        return ans;
    }
}