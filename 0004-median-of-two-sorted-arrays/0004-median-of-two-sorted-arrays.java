class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = nums1.length;
        int j = nums2.length;
        int n = i+j;

        int[] merged_array = new int[n];
         
         // Merge two array into one array
        System.arraycopy(nums1, 0, merged_array, 0, i);
        System.arraycopy(nums2, 0, merged_array, i, j);
 
        // Sort the merged array
        Arrays.sort(merged_array);
       
        // If length of array is even
        if (n % 2 == 0)
        {
            int z = n / 2;
            int e = merged_array[z];
            int q = merged_array[z - 1];
 
            double ans = (double)(e + q) / 2;
            return ans;
        }
       
        // If length if array is odd
        else
        {
            int z = Math.round(n / 2);
            return merged_array[z];
        }
 
    }
}