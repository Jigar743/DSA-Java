package com.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int k = 0; k < n - 2; k++) {

            if (k > 0 && nums[k] == nums[k- 1]) {
                continue;
            }

            int i = k + 1, j = n - 1;
            int target = -nums[k];

            while (i < j) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (i < j && nums[i] == nums[i + 1]) {
                        i++;
                    }

                    while (i < j && nums[j] == nums[j - 1]) {
                        j--;
                    }

                    i++;
                    j--;
                } else if (sum > target) {
                    j--;
                } else {
                    i++;
                }
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = solve(nums);
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }

    }
}
