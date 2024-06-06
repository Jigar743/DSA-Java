package com.SlidingWindow;

public class BestTimeToBuyAndSellStocks {
    public static int maxProfit(int[] A) {
        int n = A.length, buyingPtr = Integer.MAX_VALUE;

        int ans = 0;

        for (int i = 0; i < n; i++) {
            buyingPtr = Math.min(buyingPtr, A[i]);
            ans = Math.max(ans, A[i] - buyingPtr);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(arr));
    }
}
