class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0], max_profit = 0;
    for (int i = 1; i < prices.length; i++) {
 
      // Checking for least buying value
      if (buy > prices[i])
        buy = prices[i];
 
      // Checking for highest profit
      else if (prices[i] - buy > max_profit)
        max_profit = prices[i] - buy;
    }
    return max_profit;
    }
}