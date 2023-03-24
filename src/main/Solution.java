package main;

import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        for (int num : nums)
            if (!unique.add(num)) return true;

        return false;
    }
}
