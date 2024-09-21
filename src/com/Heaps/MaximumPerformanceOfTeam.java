package com.Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumPerformanceOfTeam {
    public static int solve(int n, int[] speed, int[] efficiency, int k) {
        long mod = 1000 * 1000 * 1000 + 7;

        int[][] pair = new int[n][2];
        for(int i = 0; i< n; i++) {
            pair[i][0] = efficiency[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a, b) -> b[0] - a[0]);

        long speedSum = 0, answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int[] p: pair) {
            speedSum += p[1];
            heap.add(p[1]);

            if(heap.size() > k) {
                speedSum -= heap.poll();
            }

            answer = Math.max(answer, speedSum * p[0]);
        }

        return (int) (answer % mod);
    }
    public static void main(String[] args) {
        int[] speed = {2, 10, 3, 1, 5, 8};
        int[] efficiency = {5, 4, 3, 9, 7, 2};
        int k = 2;

        System.out.println(solve(speed.length, speed, efficiency, k));
    }
}
