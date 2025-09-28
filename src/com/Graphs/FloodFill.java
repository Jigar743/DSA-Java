package com.Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;

        int[][] result = new int[n][m];
        for(int i =0; i< n; i++) {
            for(int j =0; j< m; j++) {
                result[i][j] = image[i][j];
            }
        }

        int oldColor = image[sr][sc];
        if (oldColor == color) return result;

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(sr, sc));
        result[sr][sc] = color;

        while (!queue.isEmpty()) {
            int row = queue.peek().first;
            int col = queue.peek().second;
            queue.poll();

            for(int delRow = -1; delRow <= 1; delRow++) {
                for (int delCol = -1; delCol <= 1; delCol++) {
                    if(Math.abs(delRow) + Math.abs(delCol) == 2) continue;
                    int nRow = row + delRow;
                    int nCol = col + delCol;

                    if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && result[nRow][nCol] == oldColor){
                        result[nRow][nCol] = color;
                        queue.add(new Pair(nRow, nCol));
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1, sc = 1;
        int newColor = 2;

        int [][] result = floodFill(image, sr, sc, newColor);

        for (int i = 0; i< image.length; i++) {
            for(int j = 0; j< image[0].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
