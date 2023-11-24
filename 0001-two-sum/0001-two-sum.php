class Solution {

    /**
     * @param Integer[] $nums
     * @param Integer $target
     * @return Integer[]
     */
function twoSum($nums, $target) {
    $numIndices = array(); // Initialize an empty associative array to store elements and their indices
    
    foreach ($nums as $index => $num) {
        $complement = $target - $num;
        
        // Check if the complement of the current number exists in the $numIndices array
        if (array_key_exists($complement, $numIndices)) {
            // If found, return the indices of the two numbers
            return [$numIndices[$complement], $index];
        }
        
        // Otherwise, store the current number and its index in the $numIndices array
        $numIndices[$num] = $index;
    }
    
    // If no solution is found, return an empty array or handle it as needed
    return [];
}

}