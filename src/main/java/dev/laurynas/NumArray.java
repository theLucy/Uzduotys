package dev.laurynas;

import java.util.ArrayList;
import java.util.Arrays;

public class NumArray {

    final int[] nums;
    ArrayList<Integer> sums;

    public NumArray(int[] nums) {
        this.nums = nums;
        sums = Arrays.stream(nums).
                collect(ArrayList::new,
                        (l, r) -> l.add(l.size() > 0 ? l.get(l.size() - 1) + r : r),
                        ArrayList::addAll);
    }

    public int sumRange(int left, int right) {
        return left == 0 ?
                sums.get(right) :
                sums.get(right) - sums.get(left - 1);
    }
}