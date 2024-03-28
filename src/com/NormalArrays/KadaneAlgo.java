package com.NormalArrays;

public class KadaneAlgo {
    public static void main(String[] args) {
        System.out.println("From Normal Array package");

        KadaneAlgo ka = new KadaneAlgo();
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int maxSum = ka.maxSubArray(arr);

        System.out.println(maxSum);
    }
    public int maxSubArray(int[] A){
        int max = Integer.MIN_VALUE, sum = 0;
        for (int j : A) {
            sum += j;
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
