class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int direction=0;
        int left=0;
        int right=matrix[0].size()-1;
        int top=0;
        int bottom=matrix.size()-1;
        vector<int>ans;

        while(left<=right&&top<=bottom)
        {   
           // printing left to right
            if(direction==0)
            {
              
                for(int col=left; col<=right; col++)
                {
                   ans.push_back(matrix[top][col]);
                }
                top++;
            }
           // printing top to bottom
            else if(direction == 1)
            {
                for(int row=top; row<=bottom; row++)
                {
                    ans.push_back(matrix[row][right]);
                }
                right--;
            }
           // printing right to left
            else if(direction==2)
            {
                for(int col=right; col>=left; col--)
                {
                   ans.push_back(matrix[bottom][col]);
                }
                bottom--;
            }
           // printing right to left
            else
            {
                for(int row=bottom; row>=top; row--)
                {
                    ans.push_back(matrix[row][left]);
                }
                left++;
            }
            direction=(direction+1)%4;
        }
           return ans;
    }
    
};