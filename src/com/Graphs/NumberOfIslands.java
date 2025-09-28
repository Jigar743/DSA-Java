package com.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void bfsCall(int row, int col, int[][] visited, char[][] islandMat) {
        visited[row][col] =1;
        Queue<Pair> queue = new LinkedList<>();
        int n = islandMat.length;
        int m = islandMat[0].length;

        queue.add(new Pair(row, col));

        while (!queue.isEmpty()) {
            int first = queue.peek().first;
            int second = queue.peek().second;
            queue.poll();

            for(int delRow = -1; delRow <= 1; delRow++) {
                for(int delCol = -1; delCol <= 1; delCol++) {

                    if (Math.abs(delRow) + Math.abs(delCol) != 1) continue;

                    int nrow = first + delRow;
                    int ncol = second + delCol;

                    if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && islandMat[nrow][ncol] == '1' && visited[nrow][ncol] == 0) {
                        visited[nrow][ncol] = 1;
                        queue.add(new Pair(nrow, ncol));
                    }
                }
            }
        }
    }

    public static int calculateNumberOfIslands(char[][] islandMat) {
        int count = 0;
        int n = islandMat.length;
        int m = islandMat[0].length;
        int[][] visited = new int[n][m];

        for(int i = 0; i< n; i++) {
            for(int j = 0; j< m; j++) {
                if(visited[i][j] == 0 && islandMat[i][j] == '1') {
                    System.out.println("i: " + i + " j: " + j);
                    count++;
                    bfsCall(i, j, visited, islandMat);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] islandMat = {
                             {'1', '1', '1', '1', '0'},
                             {'1', '1', '0', '1', '0'},
                             {'1', '1', '0', '0', '0'},
                             {'0', '0', '0', '0', '0'}
                            };

        System.out.println(calculateNumberOfIslands(islandMat));
    }
}
