package main;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        System.out.println(isHappy(19)); // Expected true
        System.out.println(isHappy(2)); // Expected false
    }

    public static boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();
        int sum;
        for (; ; ) {
            sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }

            if (sum == 1) return true;
            if (!seenNumbers.add(sum)) return false;
            n = sum;
        }
    }
}
