class Solution {
    public String decodeString(String s) {
        
        Stack<String> st = new Stack();
        Stack<Integer> ds = new Stack();
        
        int n = s.length();
        for(int i=0; i<n; i++) {
            char c = s.charAt(i);

            // if current char is digit
            if(Character.isDigit(c)) {
                int x = 0;
                while(Character.isDigit(s.charAt(i))) {
                    x = (x*10) + (s.charAt(i) - '0');
                    i++;
                }
                // again increment will be done by for loop, so need to decrement to avoid skips
                i--;
                ds.push(x);
            } else if(c == ']'){   // pop until we find '[' to form a string to repeat
                String str = "";
                while(!st.isEmpty() && !st.peek().equals("[")) {
                    str = st.pop() + str;
                }
                if(!st.isEmpty())
                    st.pop();      // to remove '[' from st
                st.push(repeat(str, ds.pop()));
            } else {
                st.push(c+"");
            }
        }

        s = "";
        while(!st.isEmpty())
            s = st.pop() + s;

        return s;
    }

    public String repeat(String s, int x) {
        String r = "";
        for(int i=0; i<x; i++) {
            r += s;
        }
        return r;
    }
}