package com.Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {

    static class Pair {
        int row;
        int col;
        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] visited = new int[n][m];
        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i< n; i++){
            for(int j = 0; j< m; j++) {
                if(i > 0 && i < n - 1 && j > 0 && j< m - 1) {
                    if(board[i][j] == 'X'){
                        visited[i][j] = 1;
                    }
                } else {
                    if(board[i][j] == 'O'){
                        queue.add(new Pair(i, j));
                    }else {
                        visited[i][j] = 1;
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

            for(int i = 0; i< 4; i++) {
                int newRow = row + delRow[i];
                int newCol = col + delCol[i];

                if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && visited[newRow][newCol] == 0) {
                    queue.add(new Pair(newRow, newCol));
                    visited[newRow][newCol] = 1;
                }
            }
        }


        for(int i = 0; i< n; i++) {
            for(int j = 0; j< m; j++) {
                if(visited[i][j] == 0){
                    board[i][j] = 'X';
                }
            }
        }

        for(int i = 0; i< n; i++){
            System.out.println(Arrays.toString(board[i]));
        }

    }

    public static void main(String[] args) {
        char[][] input = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
                {'O', 'X', 'X', 'X'}
        };
        solve(input);
    }
}
