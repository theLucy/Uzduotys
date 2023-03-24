package main;

import java.util.HashMap;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> mapas = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mapas.containsKey(nums[i])) {
                if (Math.abs(i - mapas.get(nums[i])) <= k) {
                    return true;
                }
                mapas.replace(nums[i], i);
            } else {
                mapas.put(nums[i], i);
            }
        }
        return false;
    }
}
