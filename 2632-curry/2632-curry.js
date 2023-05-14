/**
 * @param {Function} fn
 * @return {Function}
 */
var curry = function(fn) {
    const argsLen = fn.length; // save the number of arguments our callback function expects
    let curryFuncArgs = [];
    
    return function curried(...args) { // rest parameters

        curryFuncArgs = [...curryFuncArgs, ...args]; // merge two arrays using spread operator
        
        if (curryFuncArgs.length === argsLen) {
            return fn(...curryFuncArgs);
        } else {
            return curried;
        }
    };
};
/**
 * function sum(a, b) { return a + b; }
 * const csum = curry(sum);
 * csum(1)(2) // 3
 */
