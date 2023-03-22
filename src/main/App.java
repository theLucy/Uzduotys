package main;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3})); // Expected 3
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})); // Expected 2
    }

    public static int majorityElement(int[] nums) {
        int treshold = nums.length / 2;
        int n = 0;
        int elem = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int num : nums) {
            if (num != elem) {
                elem = num;
                n = 1;
            } else n++;

            if (n > treshold) return elem;
        }
        return 0;
    }
}