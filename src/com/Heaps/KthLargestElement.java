package com.Heaps;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static int solve(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            maxHeap.add(num);
        }
        int ans = 0, count = 0;;
        while (!maxHeap.isEmpty()) {
            count++;
            if(count == k) {
                ans = maxHeap.poll();
                break;
            }
            maxHeap.poll();
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        System.out.println(solve(arr, 2));
    }
}
