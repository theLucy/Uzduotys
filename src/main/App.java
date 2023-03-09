package main;

public class App {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2})); //2.0;
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4})); //2.5;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int i1 = 0, i2 = 0;

        boolean isLeft = false;

        if (nums1.length == 0)
            return nums2.length % 2 == 1 ? nums2[(nums2.length - 1) / 2] :
                    (nums2[nums2.length / 2 - 1] + nums2[nums2.length / 2]) / 2.0;
        else if (nums2.length == 0)
            return nums1.length % 2 == 1 ? nums1[(nums1.length - 1) / 2] :
                    (nums1[nums1.length / 2 - 1] + nums1[nums1.length / 2]) / 2.0;

        for (int i = 0; i < len; i++) {

            if (i1 < nums1.length && nums1[i1] > nums2[i2]) {
                i2++;
                isLeft = false;
            } else if (i2 < nums2.length && i1 < nums1.length && nums1[i1] <= nums2[i2]) {
                i1++;
                isLeft = true;
            }

            if (len % 2 == 0 && i == (len / 2) - 1) {

                int currentElement = isLeft ? nums1[i1 - 1] : nums2[i2 - 1];
                int nextElement;

                if (i1 >= nums1.length) nextElement = nums2[i2];
                else if (i2 >= nums2.length) nextElement = nums1[i1];
                else nextElement = Math.min(nums1[i1], nums2[i2]);

                return (currentElement + nextElement) / 2.0;
            } else if (len % 2 == 1 && i == (len - 1) / 2)
                return isLeft ? nums1[i1 - 1] : nums2[i2 - 1];

        }
        return 0;
    }
}