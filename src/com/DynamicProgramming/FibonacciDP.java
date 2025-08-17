package com.DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FibonacciDP {
    public static long fibonacci(int nu, long[] dp) {
        if (nu <= 1) return nu;

        if (dp[nu] != -1) return dp[nu];

        dp[nu] = fibonacci(nu - 1, dp) + fibonacci(nu - 2, dp);
        return dp[nu];
    }
    public static void main(String[] args) {
        int n = 1000;
        long[] dp = new long[n+1];
        Arrays.fill(dp, -1);

        System.out.println(fibonacci(n, dp));
    }
}
