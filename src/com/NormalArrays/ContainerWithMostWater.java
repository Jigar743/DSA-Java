package com.NormalArrays;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int n = height.length;
        int ans = 0;
        int left = 0, right = n - 1;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int minHeight = Math.min(height[i], height[j]);
//                int width = j - i;
//
//                ans = Math.max(ans, minHeight * width);
//            }
//        }

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            ans = Math.max(ans, minHeight * width);

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int[] heights = {1,3,2,5,25,24,5};
        System.out.println(maxArea(heights));
    }
}
