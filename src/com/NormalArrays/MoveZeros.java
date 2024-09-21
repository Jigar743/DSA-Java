package com.NormalArrays;

import java.util.Arrays;

public class MoveZeros {
    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public static void moveZeros(int[] nums) {
        int i = 0;
        for(int j = 0; j< nums.length; j++) {
            if(nums[j] != 0) {
                swap(nums, i, j);
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeros(arr);
    }
}
