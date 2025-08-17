package com.SlidingWindow;

public class LongestSubarrayOfOnes {
    public static int longestSubarray(int[] nums) {
        int start = 0, end = 0, maxSub = 0, zeros = 0;

        while (end < nums.length) {
            if(nums[end] == 0) {
                zeros++;
            }
            while (zeros > 1) {
                if(nums[start] == 0) {
                    zeros--;
                }
                start++;
            }

            maxSub = Math.max(maxSub, end - start);

            end++;
        }
        return maxSub;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 1, 1, 0, 1};
//        int[] arr = {1, 1, 0, 1};
        System.out.println(longestSubarray(arr));
    }
}
