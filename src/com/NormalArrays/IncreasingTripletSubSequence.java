package com.NormalArrays;

public class IncreasingTripletSubSequence {
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        int n = nums.length;

        for(int num: nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }

        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr = {20, 100, 10, 12, 5, 13};

        System.out.println(increasingTriplet(arr));
    }
}
