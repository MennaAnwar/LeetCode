class Solution {
    public int mincostTickets(int[] days, int[] cost) {
        
        int maxDay=0;
        for(int i : days) {
            maxDay = Math.max(i,maxDay);
        }
        int [] dp = new int [maxDay+1];
        int k=0;
        for(int i=1;i<=maxDay;i++) {
            if(k<days.length && i==days[k]) {
                int oneDay = Math.max(0,days[k]-1);
                int sevenDay = Math.max(0,days[k]-7);
                int thirtyDay = Math.max(0,days[k]-30);
                dp[i] = Math.min(dp[oneDay]+cost[0], Math.min(dp[sevenDay]+cost[1], dp[thirtyDay]+cost[2]));
                k++;
            } else { // Days that we don't travel (intuition is that suppose you travelled on day 1 and spent 2$ for it and then next travel day is 5 so between 1 and 4 (both inclusive) you spent 2$.)
                dp[i]=dp[i-1];
            }
            
        }
        return dp[maxDay];
    }
}