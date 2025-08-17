package com.Graphs.undirected;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DFSTravel {
    static void dfsWithList(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> result) {
        result.add(node);
        visited[node] = true;

        for(int neighbor: adj.get(node)) {
            if(!visited[neighbor]) {
                dfsWithList(neighbor, adj, visited, result);
            }
        }
    }

    public static void main(String[] args) {
        UndirectedGraph graph = new UndirectedGraph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
        int start = 3;
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[graph.adjList.size()];

        dfsWithList(start, graph.adjList, visited, result);
        System.out.println(result);
    }
}
