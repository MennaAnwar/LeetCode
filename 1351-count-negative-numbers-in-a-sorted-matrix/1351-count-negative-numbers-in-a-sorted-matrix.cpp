class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int count=0;// declearing the count variable for counting 
        for(int i=0;i<grid.size();i++){ // loop for accessing the row element
            for(int j=0;j<grid[0].size();j++){ //loop for accessing the column element
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
        
    }
};