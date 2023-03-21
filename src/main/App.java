package main;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        var test1 = new int[]{1, 2, 3};
        var test2 = new int[]{4, 3, 2, 1};
        var test3 = new int[]{9};
        System.out.println(Arrays.toString(plusOne2(test1))); // Expected [1,2,4]
        System.out.println(Arrays.toString(plusOne2(test2))); // Expected [4,3,2,2]
        System.out.println(Arrays.toString(plusOne2(test3))); // Expected [1,0]
    }

    public static int[] plusOne(int[] digits) {
        boolean all9 = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                all9 = false;
                break;
            }
        }
        if (all9) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        return digits;
    }

    public static int[] plusOne2(int[] digits) {
        int carry = 1;
        int[] result = new int[digits.length];
        for (int i = digits.length - 1; i >= 0; i--) {
            int val = digits[i] + carry;
            result[i] = val % 10;
            carry = val / 10;
        }
        if (carry == 1) {
            result = new int[digits.length + 1];
            result[0] = 1;
        }
        return result;
    }
}