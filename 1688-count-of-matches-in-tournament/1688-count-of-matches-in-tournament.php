class Solution {

    /**
     * @param Integer $n
     * @return Integer
     */
    function numberOfMatches($n) {
        $matches = 0;
        while($n>1){
            if($n%2==0){
                $n = $n / 2;
                $matches += $n;
            }else{
                $n = ($n-1) / 2;
                $matches += $n+1;
            }
        }
        return $matches;
    }
}
