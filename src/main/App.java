package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        assert findMedianSortedArrays(new int[]{1, 3}, new int[]{2}) == 2.0;
        assert findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}) == 2.5;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);
        int len = nums.length;

        if(len % 2 == 1) {
            return nums[(len - 1) / 2];
        } else {
            return (nums[len/2] + nums[len/2-1]) / 2.0;
        }
    }
}