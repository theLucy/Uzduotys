package dev.laurynas;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] ss = s.split(" ");
        if (pattern.length() != ss.length) {
            return false;
        }

        if (pattern.length() == 1) {
            return true;
        }

        String[] map = new String[26];

        for (int i = 0; i < ss.length; i++) {
            int key = pattern.charAt(i) - 'a';
            if (map[key] != null) {
                if (!map[key].equals(ss[i])) {
                    return false;
                }
            } else {

                for (String s1 : map) {
                    if (s1.equals(ss[i])) return false;
                }
                map[key] = ss[i];
            }
        }
        return true;
    }

}
