int largestAltitude(int* gain, int gainSize){
    int n=0,max=0;
    for(int i=0;i<gainSize;i++)
    {
        n=n+gain[i];
        max=max>n?max:n;
    }
    return max;
}