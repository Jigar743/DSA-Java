package com.Heaps;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HeapProblems h1 = new HeapProblems();

        int[] arr = {1, 2, 3, 5};
        int[] result = h1.FindBthSmallestPrimeFraction(arr, 3);

        System.out.println(Arrays.toString(result));

        int ans = h1.MishaAndCandies(new int[]{3, 2, 3}, 4);
        System.out.println(ans);
    }
}
