package com.Heaps;

import java.util.PriorityQueue;

public class MishaAndCandales {
    public static void main(String[] args) {
        MishaAndCandales m1 = new MishaAndCandales();
        int[] arr = {3, 2, 3};
        System.out.println(m1.solve(arr, 4));
    }

    public int solve(int[] A, int B) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int val : A) {
            q.add(val);
        }

        int count = 0;
        while (!q.isEmpty()) {
            int x = q.poll();
            if (x > B) break;
            count += x / 2;
            if (!q.isEmpty()) {
                int remaining = x - x / 2, tmp = q.poll();
                q.add(tmp + remaining);
            }
        }

        return count;
    }
}
