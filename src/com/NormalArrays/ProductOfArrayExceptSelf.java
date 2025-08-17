package com.NormalArrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];

        leftProduct[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }

        rightProduct[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        }

        for(int i = 0; i< n; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }

        return result;
    }

    public static int[] bruteForceSolution(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for(int i = 0; i< n; i++) {
            int leftProduct = 1, rightProduct = 1;

            // for total left product find
            for(int j = i -1; j >= 0; j--) {
                leftProduct *= nums[j];
            }

            // for total right product find
            for(int j = i+1; j < n; j++) {
                rightProduct *= nums[j];
            }

            result[i] = leftProduct * rightProduct;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        // but this will give you a TLE (Time Limit Exceed)
        // This solution will not work
        // this is O(n^2) solution in worst case
        System.out.println(Arrays.toString(bruteForceSolution(nums)));

        // Here is the O(n) solution
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
