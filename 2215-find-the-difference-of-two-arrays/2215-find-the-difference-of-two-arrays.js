/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[][]}
 */
var findDifference = function(nums1, nums2) {
  const array1 = []
  const array2 = []  
    for (let i=-1000; i<1001; i++){
        if(nums1.includes(i) && !nums2.includes(i)){
            array1.push(i)
        }
        if(nums2.includes(i) && !nums1.includes(i)){
            array2.push(i)
        }
    }
return[array1,array2]

};