package dev.laurynas;

public class Solution {
    public boolean isPerfectSquare(int num) {
        for (int i = 1; i < 46341; i++) {
            if (i * i == num) return true;
            if (i * i > num) return false;
        }
        return false;
    }
}
