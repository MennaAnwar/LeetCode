class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;){
            int count=0;
            int temp=nums[i];
            while(i<nums.length && temp==nums[i]){
                count++;
                i++;
            }
            List<Integer> t=new ArrayList<>();
            t.add(temp);
            t.add(count);
            list.add(t);
        }
        int arr[][] =new int[list.size()][2];
        for(int i=0;i<arr.length;i++){
            arr[i][0]=list.get(i).get(0);
            arr[i][1]=list.get(i).get(1);
        }
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        int ans[]=new int[k];
        int end=arr.length-1;
        for(int i=0;i<k;i++){
            ans[i]=arr[end-i][0];
        }
        Arrays.sort(ans);
        return ans;
    }
}