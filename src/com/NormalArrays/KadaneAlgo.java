package com.NormalArrays;

public class KadaneAlgo {
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
