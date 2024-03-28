package com.Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class AthLargestElement {
    public static void main(String[] args) {
        int[] arr = {15, 20, 99, 1};

        System.out.println(Arrays.toString(solve(2, arr)));
    }

    public static int[] solve(int A, int[] B){
        int n = B.length;
        int[] ans = new int[n];

        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        for (int i = 0; i < A - 1; i++) {
            ans[i] = -1;
            numbers.add(B[i]);
        }

        numbers.add(B[A-1]);
        ans[A - 1] = numbers.peek();

        for (int i = A; i < n; i++) {
            if (B[i] > numbers.peek()) {
                numbers.remove();
                numbers.add(B[i]);
            }
            ans[i] = numbers.peek();
        }

        return ans;

    }
}
