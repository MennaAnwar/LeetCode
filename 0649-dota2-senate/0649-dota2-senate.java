class Solution {
    public String predictPartyVictory(String senate) {
               int[] arr = new int[senate.length()];
        char[] s = senate.toCharArray();
        int rad = 0;
        int dir = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'R') rad++;
            if (s[i] == 'D') dir++;
        }

        do {
            for (int i = 0; i < s.length; i++) {
                if (arr[i] == 0) {
                    boolean help = true;
                    for (int j = i; j < s.length; j++) {
                        if (arr[j] == 0 && s[i] != s[j]) {
                            if (s[j] == 'R') rad--;
                            if (s[j] == 'D') dir--;
                            arr[j]++;
                            help = false;
                            break;
                        }
                    }
                    if (help) for (int j = 0; j < i; j++) {
                        if (arr[j] == 0 && s[i] != s[j]) {
                            if (s[j] == 'R') rad--;
                            if (s[j] == 'D') dir--;
                            arr[j]++;
                            break;
                        }
                    }
                }
            }
        } while ((dir != 0 && rad  != 0) );

        if (dir != 0) return "Dire";
        return "Radiant";
    }
}