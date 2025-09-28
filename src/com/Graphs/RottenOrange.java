package com.Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RottenOrange {
    static class Pair {
        int first;
        int second;
        int time;

        public Pair(int first, int second, int time) {
            this.time = time;
            this.first = first;
            this.second = second;
        }
    }
    public static int CalcFunc(int[][] grid) {
        int time = 0;
        Queue<Pair> queue = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j< m; j++) {
                if(grid[i][j] == 2) {
                    queue.add(new Pair(i, j, 0));
                }
            }
        }

        while(!queue.isEmpty()) {
            int row = queue.peek().first;
            int col = queue.peek().second;
            int timer = queue.peek().time;
            queue.poll();

            time = Math.max(time, timer);
            System.out.println("row: " + row + " col: " + col + " time: "+ timer);

            for(int delRow = -1; delRow <= 1; delRow++) {
                for(int delCol = -1; delCol <= 1; delCol++) {
                    if(Math.abs(delRow) + Math.abs(delCol) == 2) continue;

                    int nRow = row + delRow;
                    int nCol = col + delCol;

                    if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && grid[nRow][nCol] == 1) {
                        queue.add(new Pair(nRow, nCol, timer + 1));
                        grid[nRow][nCol] = 2;
                    }
                }
            }
        }

        for (int[] ints : grid) {
            for (int j = 0; j < m; j++) {
                if (ints[j] == 1) return -1;
            }
        }

        return time;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        System.out.println(CalcFunc(grid));
    }
}
