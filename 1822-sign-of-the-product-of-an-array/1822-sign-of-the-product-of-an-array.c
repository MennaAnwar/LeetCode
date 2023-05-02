int signFunc(int product){
    if(product > 0){
        return 1;
    }
    else if(product < 0){
        return -1;
    }
    else{
        return 0;
    }
}
int arraySign(int* nums, int numsSize){
int sign = 1;
for(int i =0; i< numsSize; i++){
    sign *= signFunc(nums[i]);
}
return sign;
}