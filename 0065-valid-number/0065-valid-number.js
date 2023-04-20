/**
 * @param {string} s
 * @return {boolean}
 */
var isNumber = function(s) {
    // trim removes white spaces from begining and end of string
    s = s.trim();
    let regex = /^[+-]?(\d+\.?|\.\d+|\d+\.\d+)([eE][+-]?\d+)?$/;
    // test tries to match regex
    return regex.test(s);
};
