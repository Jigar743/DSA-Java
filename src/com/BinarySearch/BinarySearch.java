package com.BinarySearch;

public class BinarySearch {
    public static int solve(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right--;
            else left++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};

        System.out.println(solve(arr, 9));
    }
}
