/**
 * @param {any} object
 * @return {string}
 */
var jsonStringify = function(object) {
  if (typeof object === 'string') {
    return '"' + object.replace(/\\/g, '\\\\').replace(/"/g, '\\"') + '"';
  } else if (typeof object === 'number' || typeof object === 'boolean' || object === null) {
    return String(object);
  } else if (Array.isArray(object)) {
    var elements = object.map(function(element) {
      return jsonStringify(element);
    });
    return '[' + elements.join(',') + ']';
  } else if (typeof object === 'object') {
    var properties = Object.keys(object).map(function(key) {
      var value = jsonStringify(object[key]);
      return '"' + key + '":' + value;
    });
    return '{' + properties.join(',') + '}';
  }
};