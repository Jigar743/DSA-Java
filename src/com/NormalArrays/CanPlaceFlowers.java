package com.NormalArrays;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m = flowerbed.length;
        for(int i = 0; i < m; i++) {
            boolean left = i == 0 || flowerbed[i - 1] == 0;
            boolean right = i == m - 1 || flowerbed[i + 1] == 0;
            if(left && right && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }

        return n <= 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(arr, 1));
    }
}
