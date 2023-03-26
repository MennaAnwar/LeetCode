class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        int index=1;
        for(int i=0; i<n; i++){
            ans[i+i]=nums[i];
        }
        for(int i=n; i<nums.length; i++){
            ans[index]=nums[i];
            index += 2;
        }
        return ans;
    }
}