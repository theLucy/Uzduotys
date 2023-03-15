package main;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"})); // "fl"
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"})); // ""
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        boolean isCommonChar = true;


        int shortestWord = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            shortestWord = Math.min(shortestWord, strs[i].length());
        }

        char[][] wordChars = new char[strs.length][];

        for (int i = 0; i < strs.length; i++) {
            wordChars[i] = strs[i].toCharArray();
        }

        for (int i = 0; i < shortestWord; i++) {
            char x = wordChars[0][i];
            for (int j = 1; j < strs.length; j++) {
                if (x != wordChars[j][i]) return prefix.toString();
            }
            prefix.append(x);
        }

        return prefix.toString();
    }

    /*public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }*/
}