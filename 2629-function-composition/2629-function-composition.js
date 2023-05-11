/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
	return function(x) {
    let n = functions.length;
    let res = x;
    for(let i=0;i<n;i++){
      res = functions[n-1-i](res);
    }
      return res;
    }
};


/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */