/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function (word1, word2) {
  const n = Math.min(word1.length, word2.length);
  let sb = '';

  for (let i = 0; i < n; i++) {
    sb += word1[i];
    sb += word2[i];
  }

  return sb + word1.substring(n) + word2.substring(n);
}
