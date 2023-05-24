/**
 * @param {object} obj1
 * @param {object} obj2
 * @return {object}
 */
function objDiff(obj1, obj2) {
    // If obj1 and obj2 are equal, there are no differences
    if(obj1 === obj2) return {};

    // If either obj1 or obj2 is null, return the pair
    // If either obj1 or obj2 is not an object, return the pair
    if(obj1 === null || obj2 === null || typeof obj1 !== "object" || typeof obj2 !== "object") return [obj1 , obj2];

    // Base case: If obj1 and obj2 have different types (array vs. non-array), return the pair
    if(Array.isArray(obj1) !== Array.isArray(obj2)) return [obj1, obj2];

     // Create an empty object to store the differences
    const newObj = {};
    
    for(const key in obj1){ // Iterate over the keys of obj1
        if(key in obj2){ // Check if the same key exists in obj2
            // Recursive call: Compare the nested values of obj1[key] and obj2[key]
            const difference = objDiff(obj1[key], obj2[key]) 
            // If subDiff is not an empty object (indicating differences), add it to returnObject
            if(Object.keys(difference).length > 0){
                newObj[key] = difference
            }
        }
    }

     // Return the object containing the differences between obj1 and obj2
    return newObj;
};