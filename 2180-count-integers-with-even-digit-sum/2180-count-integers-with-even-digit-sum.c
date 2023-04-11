int countEven(int num)
{
    int count=0;
    for(int i=2;i<=num;i++)
    { 
        int sum=0,temp=i;
        while(temp)
        {
            int digit=temp%10;
            sum=sum+digit;
            temp=temp/10;
        } 
        if(sum%2)
            continue;
        else
            count++;
    }
    return count;
}