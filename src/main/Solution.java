package main;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        StringBuilder sb;

        if (nums.length == 0) return result;

        int begin = nums[0];
        int end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (end + 1 == nums[i]) end++;
            else {
                sb = new StringBuilder();
                if (begin == end) sb.append(begin);
                else sb.append(begin).append("->").append(end);
                result.add(sb.toString());
                begin = nums[i];
                end = nums[i];
            }
        }

        sb = new StringBuilder();
        if (begin == end) sb.append(begin);
        else sb.append(begin).append("->").append(end);

        result.add(sb.toString());
        return result;
    }
}
