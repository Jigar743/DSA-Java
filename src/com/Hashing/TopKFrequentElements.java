package com.Hashing;

import java.util.*;

public class TopKFrequentElements {
    public static int[] solve(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int val : nums) {
            map.merge(val, 1, Integer::sum);
        }

        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int index = 0;
        int[] result = new int[k];
        for (int i = nums.length; i >= 0; i--) {
            if (bucket[i] != null)
                for (int val : bucket[i]) {
                    result[index++] = val;
                    if (index == k)
                        return result;

                }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2}; // 1, 1, 1, 2, 2, 3
        int k = 2;

        System.out.println(Arrays.toString(solve(arr, k)));
    }
}
