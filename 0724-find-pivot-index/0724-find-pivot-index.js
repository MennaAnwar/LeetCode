/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
    let totalSum = 0;
    let leftSum = 0;

    // to get Total sum of elements
    nums.map(num => totalSum += num);

    // test the pivot
    for(let i =0 ; i< nums.length ; i++){
        if(totalSum - (leftSum + nums[i]) == leftSum ){
            return i;
        }
        leftSum += nums[i];
    }
    return -1;
    
};