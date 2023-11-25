/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getSumAbsoluteDifferences = function(nums) {
    const r = [], t = nums.reduce( (a,b) => a+b )
    for ( let i = 0, s = 0; i < nums.length; s += nums[i++] )
        r[i] = nums[i]*i-s + (t-s)-nums[i]*(nums.length-i)
    return r
};