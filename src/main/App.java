package main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {

        var result1 = List.of(
                twoSum(new int[]{2, 7, 11, 15}, 9),
                twoSum(new int[]{3, 2, 4}, 6),
                twoSum(new int[]{3, 3}, 6),
                twoSum(new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21}, 26)
        );

        result1.forEach(x -> x.map(Arrays::toString).ifPresent(System.out::println));

    }

    public static Optional<int[]> twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target)
                    return Optional.of(new int[]{i, j});

        return Optional.empty();
    }
}