/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    const filteredArray = [];

    arr.forEach((e,i) => {
        if(fn(e, i)) {
            filteredArray.push(e);
        }
    })
    return filteredArray;
};