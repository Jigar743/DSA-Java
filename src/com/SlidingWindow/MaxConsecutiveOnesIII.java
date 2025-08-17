package com.SlidingWindow;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, maxLength = 0, zeros = 0, length;

        while(right < nums.length) {
            if(nums[right] == 0){
                zeros++;
            }
            if(zeros>k){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }

            if(zeros <= k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        System.out.println(longestOnes(arr, 3));
    }
}
