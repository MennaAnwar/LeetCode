class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        // if both strings aren't equal
        if(s.length() != t.length()) return false;

        // if both strings are identical
        if(s.equals(t)) return true;
 
        HashMap<Character, Character> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            // if map contaisn key c --> compare it witother string
            if(map.containsKey(c)){
                // if s[i]  !=  t[i] --> return false
                if(! map.get(c).equals(t.charAt(i)) )
                return false;
            }
            else{
                if( map.containsValue(t.charAt(i)) )
                return false;

                // if key is not found in map .. add it
                else 
                map.put(c, t.charAt(i));
            }
        }
       return true;
    }
}