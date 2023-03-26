class Solution {
  public int[] leftRigthDifference(int[] nums) {
    final int n = nums.length;
    int[] ans = new int[n];
    int[] leftSum = new int[n];
    int[] rightSum = new int[n];
    int forwardSum = 0;
    int backwardSum = 0;

    for (int i = 0; i < n; ++i) {
      if (i > 0)
        forwardSum += nums[i - 1];
      leftSum[i] = forwardSum;
    }

    for (int i = n - 1; i >= 0; --i) {
      if (i + 1 < n)
        backwardSum += nums[i + 1];
      rightSum[i] = backwardSum;
    }

    for (int i = 0; i < n; ++i)
      ans[i] = Math.abs(leftSum[i] - rightSum[i]);

    return ans;
  }
}
