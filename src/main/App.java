package main;

public class App {
    public static void main(String[] args) {
        assert 3 == lengthOfLongestSubstring("abcabcbb");
        assert 1 == lengthOfLongestSubstring("bbbbb");
        assert 3 == lengthOfLongestSubstring("pwwkew");
        assert 11 == lengthOfLongestSubstring("ahheklscvytahgv");
        assert 2 == lengthOfLongestSubstring("aab");
    }

    public static int lengthOfLongestSubstring(String s) {
        StringBuilder substring = new StringBuilder();
        char[] chars = s.toCharArray();
        int longestStrLen = 0;
        int result = 0;

        int start = 0;

        for (int i = start; i < chars.length; i++) {
            if (result >= chars.length - start) break;
            if (!substring.toString().contains(String.valueOf(chars[i]))) {
                substring.append(chars[i]);
                longestStrLen++;
                result = Math.max(result, longestStrLen);
            } else {
                longestStrLen = 0;
                substring = new StringBuilder();
                i = start++;
            }

        }
        return result;
    }
}