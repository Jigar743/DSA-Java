package com.Heaps;

import java.util.PriorityQueue;

public class MinLargestElem {
    static class Pair implements Comparable<Pair> {
        int val, index;
        Pair(int sum, int i){
            this.val = sum;
            this.index = i;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.val == o.val) {
                return this.index - o.index;
            }
            return this.val - o.val;
        }
    }

    public static void main(String[] args) {
        MinLargestElem m = new MinLargestElem();

        int[] arr = {5, 1, 4, 2};
        System.out.println(m.solve(arr, 3));
    }

    public int solve(int[] A, int B){
        int n = A.length;
        int[] cloneArr = new int[n];
        System.arraycopy(A, 0, cloneArr, 0, n);

        PriorityQueue<Pair> q = new PriorityQueue<>();

        for(int i = 0; i< n; i++){
            q.add(new Pair(A[i] * 2, i));
        }

        for(int i = 0; i< B; i++){
            Pair curr = q.poll();
            cloneArr[curr.index] = curr.val;

            q.add(new Pair(curr.val + A[curr.index], curr.index));
        }

        int findMax = cloneArr[0];
        for(int i = 1; i< n; i++){
            findMax = Math.max(cloneArr[i], findMax);
        }

        return findMax;
    }
}
