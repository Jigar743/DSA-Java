package com.Graphs.undirected;

import java.util.ArrayList;
import java.util.List;

public class UndirectedGraph {
    private int V;
    public List<List<Integer>> adjList;

    public UndirectedGraph(int V){
        this.V = V;
        adjList = new ArrayList<>();
        for(int i = 0; i< V; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void printGraph() {
        for(int i = 0; i< this.V; i++) {
            System.out.print(i + " -> ");
            for(int neighbor: adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
