class Solution {    // binary search
    
    public boolean isAnswer(int[] time, int totalTrips, long ans)
    {
        long trips = 0;
        for (int x: time)
        {
            trips += ans/x;
            if (trips >= totalTrips)
                return true;
        }
        return false;
    }
    
    public long getMinPossibleAns(int[] time, int totalTrips, long l, long r)
    {
        if (l > r) return -1;
        
        long mid = l+(r-l)/2;
        
        if (isAnswer(time, totalTrips, mid)){
            long temp = getMinPossibleAns(time, totalTrips, l, mid-1);
            if (temp != -1) return temp;
            else return mid;
        }
        else
            return getMinPossibleAns(time, totalTrips, mid+1, r);
    }
    
    public long minimumTime(int[] time, int totalTrips) {
        int min = time[0];
        for (int x: time)
            min = Math.min(min, x);
        long maxAns = (long)totalTrips*min;
        
        return getMinPossibleAns(time, totalTrips, 0, maxAns);
    }
}