package main;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] nums = {3, 9, 2, 3, 1, 7, 2, 3, 5}; // Input array
        int val = 3; // Value to remove
        int[] expectedNums = {1, 2, 2, 5, 7, 9}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = removeElement(nums, val); // Calls your implementation

        //assert k == expectedNums.length;
        System.out.printf("%d | %d || %b\n\n", k, expectedNums.length, k == expectedNums.length);

        Arrays.sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < expectedNums.length; i++) {
            System.out.printf("%d | %d || %b\n", nums[i], expectedNums[i], nums[i] == expectedNums[i]);
            //assert nums[i] == expectedNums[i];
        }
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }

        return index;
    }
}