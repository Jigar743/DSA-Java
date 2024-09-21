package com.NormalArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class GreatestNuOfCandies {
    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] result = new boolean[candies.length];

        ArrayList<Boolean> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i< candies.length; i++) {
            if(max < candies[i]) {
                max = candies[i];
            }
        }

        for(int i = 0; i< candies.length; i++) {
            if(max <= candies[i] + extraCandies) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};

        System.out.println(Arrays.toString(kidsWithCandies(arr, 3)));
    }
}
