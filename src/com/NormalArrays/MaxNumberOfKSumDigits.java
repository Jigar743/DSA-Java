package com.NormalArrays;

public class MaxNumberOfKSumDigits {
    public static int maxOperations(int[] nums, int k) {
        int left = 0, right = nums.length - 1;
        int ans = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];

            if(sum == k) {
                ans++;
            }
            left++;
            right--;
        }

        return ans;

    }
    public static void main(String[] args) {
        int[] nums = {4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4};
        int k = 2;

        System.out.println(maxOperations(nums, k));
    }
}
