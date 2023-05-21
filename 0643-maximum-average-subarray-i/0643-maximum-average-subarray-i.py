class Solution:
  def findMaxAverage(self, nums: List[int], k: int) -> float:
    total = sum(nums[:k])
    ans = total

    for i in range(k, len(nums)):
      total += nums[i] - nums[i - k]
      ans = max(ans, total)

    return ans / k
