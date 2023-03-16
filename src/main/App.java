package main;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] test1 = {1, 1, 2};
        int[] test2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(test1)); // Expected 2
        System.out.println(removeDuplicates(test2)); // Expected 5

        System.out.println(Arrays.toString(test1)); // [1, 2, ...]
        System.out.println(Arrays.toString(test2)); // [0, 1, 2, 3, 4, ...]
    }

    public static int removeDuplicates(int[] nums) {
        int ptr = 0;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[ptr])
                nums[++ptr] = nums[i];
        }
        return ptr+1;
    }
}