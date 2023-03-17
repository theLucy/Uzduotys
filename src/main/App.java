package main;

public class App {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 5)); // Expected 2
        System.out.println(searchInsert(nums, 2)); // Expected 1
        System.out.println(searchInsert(nums, 7)); // Expected 4
        System.out.println(searchInsert(new int[]{1}, 2)); // Expected 1
    }

    public static int searchInsert(int[] nums, int target) {
        if (target <= nums[0]) return 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (target == nums[i]) return i;
            if (target > nums[i] && target <= nums[i + 1]) return i + 1;
        }
        return nums.length;
    }
}