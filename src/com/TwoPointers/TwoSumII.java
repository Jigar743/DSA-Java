package com.TwoPointers;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {-1,0};
        System.out.println(Arrays.toString(solve(arr, -1)));
    }

    public static int[] solve(int[] numbers, int target){
        int[] result = new int[2];
        int ptr1 = 0, ptr2 = numbers.length - 1;

        while(ptr1 < ptr2){
            if(numbers[ptr1] + numbers[ptr2] == target) break;

            if(numbers[ptr1] + numbers[ptr2] < target) ptr1++;
            else ptr2--;
        }

        result[0] = ptr1 + 1;
        result[1] = ptr2 + 1;

        return result;
    }
}
