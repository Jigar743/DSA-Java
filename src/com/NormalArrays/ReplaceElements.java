package com.NormalArrays;

import java.util.Arrays;

public class ReplaceElements {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(solve(arr))); // output = [18, 6, 6, 6, 1, -1]
    }

    public static int[] solve(int[] arr){
        int n = arr.length;
        int max = -1;

        for(int i = n-1; i >= 0; i--){
            int newMax = Math.max(max, arr[i]);
            arr[i] = max;
            max = newMax;
        }

        return arr;
    }
}
