/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* plusOne(int* digits, int digitsSize, int* returnSize){
    // Add 1 to the last digit
    digits[digitsSize-1] += 1;
    
    // Propagate any carry from the last digit
    for(int i=digitsSize-1; i>=0; i--){
        if(digits[i] == 10){
            digits[i] = 0;
            if(i == 0){
                // If we have a carry from the first digit, we need to add an extra digit
                *returnSize = digitsSize + 1;
                int *result = (int *)malloc(*returnSize * sizeof(int));
                result[0] = 1;
                for(int j=1; j<*returnSize; j++){
                    result[j] = digits[j-1];
                }
                return result;
            } else{
                digits[i-1] += 1;
            }
        }
    }
    
    *returnSize = digitsSize;
    return digits;
}