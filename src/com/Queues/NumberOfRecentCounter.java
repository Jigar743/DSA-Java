package com.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCounter {
    private Queue<Integer> q;
    public NumberOfRecentCounter() {
        q = new LinkedList<>();
    }
    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }
    public static void main(String[] args) {
        NumberOfRecentCounter call = new NumberOfRecentCounter();
//        call.ping();
    }
}
