class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(n>0){
        sum+=(n%10) * (n%10) ;
        n/=10;
        }
        if(sum==1){
            return true;
        }
        else if(sum>=7){
        return isHappy(sum);
        }
        else{
            return false;
        }
        
    }
}