package com.NormalArrays;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] nums) {
        int[] newNums = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            newNums[nums.length - i - 1] = nums[i];
        }
        System.out.println(Arrays.toString(newNums));
    }
    public static void reverseWithSwapping(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        reverse(arr);
        reverseWithSwapping(arr);
    }
}
