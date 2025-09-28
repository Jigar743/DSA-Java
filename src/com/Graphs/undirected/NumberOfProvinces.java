package com.Graphs.undirected;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfProvinces {
    public static void numberOfProvinces(boolean[] visited, int start, List<List<Integer>> adjList) {
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();

            for(int neighbor: adjList.get(node)) {
                if(!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        UndirectedGraph graph = new UndirectedGraph(V);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);

        graph.printGraph();

        int count = 0;
        boolean[] visited = new boolean[V];
        for(int i = 0; i< V; i++) {
            if(!visited[i]) {
                count++;
                numberOfProvinces(visited, i, graph.adjList);
            }
        }

        System.out.println(count);
    }
}
