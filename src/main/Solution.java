package main;

import java.util.Arrays;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev) return true;
            prev = nums[i];
        }
        return false;
    }
}
