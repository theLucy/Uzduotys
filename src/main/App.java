package main;

public class App {
    public static void main(String[] args) {
        String haystack1 = "sadbutsad", needle1 = "sad";
        String haystack2 = "leetcode", needle2 = "leeto";
        String haystack3 = "a", needle3 = "a";

        System.out.println(strStr(haystack1, needle1)); // Expected 0
        System.out.println(strStr(haystack2, needle2)); // Expected -1
        System.out.println(strStr(haystack3, needle3)); // Expected 0

    }

    public static int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length())
            return -1;

        int index = -1;
        boolean isMatch = true;

        char[] hay = haystack.toCharArray();
        char[] nee = needle.toCharArray();

        for (int i = 0, iTmp; i < hay.length; i++) {
            if (hay.length - i < nee.length)
                return -1;
            iTmp = i;
            for (char c : nee) {
                isMatch = true;
                if (hay[iTmp++] != c) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch)
                return i;
        }

        return index;
    }
}