package com.Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class IsBipartiteGraph {
    public static boolean isBipartite (int[][] graph) {
        int V = graph.length;
        int[] visited = new int[V];

        Arrays.fill(visited, -1);

        for(int start = 0; start < V; start++){
            if(visited[start] == -1){
                Queue<Integer> queue = new LinkedList<>();
                queue.add(start);
                visited[start] = 0;

                while (!queue.isEmpty()){
                    int node = queue.poll();

                    for(int val: graph[node]) {
                        if(visited[val] == -1){
                            visited[val] = 1 - visited[node];
                            queue.add(val);
                        } else if(visited[node] == visited[val])
                            return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] input = {
                {1, 2, 3},
                {0, 2},
                {0, 1, 3},
                {0, 2}
        };

        System.out.println(isBipartite(input));
    }
}
