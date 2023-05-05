class Solution {
    public boolean square(char[][]board,int k,int l,int n,int m){
        char[]arr = new char[10];
        for(int i = k;i<n;i++){
            for(int j = l;j<m;j++){
                if(board[i][j] == '.')
                    continue;
                if(arr[board[i][j] - '0'] == '1'){
                    return false;
                }
                arr[board[i][j] - '0'] = '1';
            }
        }
        return true;
    }

    public boolean row(char[][] board,int i){
        char[]arr = new char[10];
        for(int j = 0;j<9;j++){
            if(board[i][j] == '.')
                continue;
            if(arr[board[i][j] - '0'] == '1')
                return false;
            arr[board[i][j] - '0'] = '1';
        }
        return true;
    }

    public boolean column(char[][]board,int j){
        char[]arr = new char[10];
        for(int i = 0;i<9;i++){
            if(board[i][j] == '.')
                continue;
            if(arr[board[i][j] - '0'] == '1')
                return false;
            arr[board[i][j] - '0'] = '1';            
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        for(int i = 3;i<=9;i+=3){
            for(int j = 3;j<=n;j+=3){
                if(square(board,i-3,j-3,i,j) == false)
                    return false;
            }
        }
        for(int i = 0;i<9;i++){
            if(!row(board,i))
                return false;
            if(!column(board,i))
                return false;
        }
        return true;
    }
}