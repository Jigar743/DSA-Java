package com.Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NumberOfEnclaves {
    public static class Pair {
        int row, col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static int numEnclaves(int[][] grid) {
        int resultCount = 0;
        int n = grid.length, m = grid[0].length;
        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i > 0 && i < n - 1 && j > 0 && j < m - 1) {
                    continue;
                } else {
                    if (grid[i][j] == 1) {
                        queue.add(new Pair(i, j));
                    }
                }
            }
        }

        int[] delRow = {0, -1, 0, +1};
        int[] delCol = {-1, 0, +1, 0};

        while (!queue.isEmpty()) {
            int row = queue.peek().row;
            int col = queue.peek().col;
            queue.poll();

            grid[row][col] = 0;

            for (int i = 0; i < 4; i++) {
                int newRow = row + delRow[i];
                int newCol = col + delCol[i];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m
                        && grid[newRow][newCol] == 1) {
                    queue.add(new Pair(newRow, newCol));
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    resultCount++;
                }
            }
        }

        return resultCount;

    }
    public static void main(String[] args) {
        int[][] input = {
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        };

        System.out.println(numEnclaves(input));
    }
}
