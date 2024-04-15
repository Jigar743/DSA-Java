package com.SlidingWindow;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindowMax {
    static class Pair{
        int value, index;
        public Pair(int val, int idx){
            value = val;
            index = idx;
        }
    }
    public static int[] solve(int[] nums, int k){
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.value - a.value);

        int[] result = new int[nums.length - k + 1];

        for(int i = 0; i < k; i++){
            pq.add(new Pair(nums[i], i));
        }

        int j = 0;
        result[j++] = pq.peek().value;
        for(int i = k; i< nums.length; i++){
            pq.add(new Pair(nums[i], i));

            while (pq.peek().index <= i - k){
                pq.remove();
            }
            result[j++] = pq.peek().value;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(solve(arr, k)));
    }
}
