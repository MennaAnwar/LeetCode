int equalPairs(int** grid, int gridSize, int* gridColSize)
{
int count=0;
    int n=*gridColSize;
    for(int j=0;j<n;j++)
    {
        for(int l=0;l<n;l++)
        {
          int m=0;
               for(int f=0;f<n;f++)
               {
                    if(grid[j][f]==grid[f][l])
                    {
                        m=1;
                    }
                    else
                    {
                        m=0;
                        break;
                    }

               }
          count=count+m;
        }
        
    }
return count;
}