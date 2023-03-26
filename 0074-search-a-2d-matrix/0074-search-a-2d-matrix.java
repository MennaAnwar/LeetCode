class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // using binary search
        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = m*n-1;

        while (start<=end) {
            int mid =  (start+end)/2;
            int element = matrix[mid/n][mid%n];

            if (element == target)
                return true;
            else if (target > element)
                start = mid+1;
            else 
                end = mid-1;
        }
        return false;
    }
}