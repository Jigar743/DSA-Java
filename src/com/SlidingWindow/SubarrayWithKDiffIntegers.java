package com.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubarrayWithKDiffIntegers {
    public static int solve(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0, result = 0;

        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);

                if(map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            result += right - left + 1;
            right++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3};
        int k = 2;
        System.out.println(solve(arr, k) - solve(arr, k - 1));
    }
}
