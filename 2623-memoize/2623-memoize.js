/**
 * @param {Function} fn
 */
function memoize(fn) {
    const k = {};
    return function(...args) {
        const a = String(args);
        if(a in k) return k[a];
        const ans = fn(...args);
        k[a] = ans;
        return ans;
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */