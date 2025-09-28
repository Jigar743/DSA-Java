package com.Graphs;

import java.util.*;

public class NumberOfDistinctIslands {
    static class Pair{
        int row, col;

        Pair(int r, int c) {
            this.row = r;
            this.col = c;
        }
    }
    public static void computeBfs(int[][] grid, int[][] visited, int start, int end, ArrayList<String> shape){
        int n = grid.length, m = grid[0].length;
        Queue<Pair> queue = new LinkedList<>();
        visited[start][end] = 1;
        queue.add(new Pair(start, end));

        int[] delRow = {0, -1, 0, +1};
        int[] delCol = {-1, 0, +1, 0};

        while (!queue.isEmpty()){
            Pair p = queue.poll();
            shape.add((p.row - start) + ", " + (p.col - end));
            for(int i = 0; i< 4; i++) {
                int newRow = p.row + delRow[i];
                int newCol = p.col + delCol[i];

                if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m
                        && visited[newRow][newCol] == 0 && grid[newRow][newCol] == 1) {
                    visited[newRow][newCol] = 1;
                    queue.add(new Pair(newRow, newCol));
                }
            }
        }

    }
    public static int countDistinctIslands (int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] visited = new int[n][m];
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i< n; i++) {
            for(int j = 0; j< m; j++) {
                if(grid[i][j] == 1 && visited[i][j] == 0){
                    ArrayList<String> shape = new ArrayList<>();
                    computeBfs(grid, visited, i, j, shape);

                    set.add(String.join(";", shape));
                }
            }
        }

        return set.size();
    }
    public static void main(String[] args) {
        int[][] input = {
                {1, 1, 0, 1, 1},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {1, 1, 0, 1, 1}
        };

        System.out.println(countDistinctIslands(input));
    }
}
