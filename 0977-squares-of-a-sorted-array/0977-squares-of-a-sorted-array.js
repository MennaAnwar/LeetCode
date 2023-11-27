/**
 * @param {number[]} nums
 * @return {number[]}
 */
function sortedSquares(nums) {
    // Square each element and then sort the result
    return nums.map(num => num * num).sort((a, b) => a - b);
}