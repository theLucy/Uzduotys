package dev.laurynas;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] usableLetters = new int[26];
        for (char c : magazine.toCharArray())
            usableLetters[c - 'a']++;

        for (char c : ransomNote.toCharArray()) {
            if (--usableLetters[c - 'a'] < 0)
                return false;
        }
        return true;
    }
}
