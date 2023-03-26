class Solution {
    public int fib(int n) {
        if(n <= 1) {
		return n ;
	}
	int sp=fib(n-1);
	int sp2=fib(n-2);
	return sp+sp2;
    }
}