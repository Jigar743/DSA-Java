package com.NormalArrays;

import java.util.Arrays;

public class RotateArray {
    public static int[] rotate(int[] nums, int k){
        int n = nums.length;
        k = k % n;

        int[] temp = new int[n - k];
        for(int i = 0; i< n - k; i++) {
            temp[i] = nums[i];
        }

        int j = 0;
        for(int i = n - k; i< n; i++) {
            nums[j++] = nums[i];
        }


        for(int i = 0; i< temp.length; i++) {
            nums[j++] = temp[i];
        }

        return nums;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        int k = 3;
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        System.out.println(Arrays.toString(rotate(nums, k)));
    }
}
