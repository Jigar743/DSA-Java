package com.NormalArrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("From Normal Array package");

        KadaneAlgo ka = new KadaneAlgo();
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int maxSum = ka.maxSubArray(arr);

        System.out.println(maxSum);
    }
}
