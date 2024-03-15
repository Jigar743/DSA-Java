package com.Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestEleFromMatrix {
    public static void main(String[] args) {
        KthSmallestEleFromMatrix k1 = new KthSmallestEleFromMatrix();
        int[][] arr = {{9, 11, 13}, {5, 9, 11}, {10, 12, 15}, {13, 14, 16}, {16, 20, 21}};
        System.out.println(k1.solve(arr, 12));

    }

    public int solve(int[][] A, int B){
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());

        int k = 0;
        for (int[] ints : A) {
            for (int j = 0; j < A[0].length; j++) {
                que.add(ints[j]);
                k++;
            }
        }

        System.out.println(que);

        while(k != B){
            que.remove();
            k--;
        }

        return que.peek();
    }
}
