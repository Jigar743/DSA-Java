package com.Heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FindBthSmallestPrimeFraction {
    public static void main(String[] args) {
        FindBthSmallestPrimeFraction f1 = new FindBthSmallestPrimeFraction();
        int[] arr = {1, 2, 3, 5};

        System.out.println(Arrays.toString(f1.solve(arr, 3)));
    }

    public static class Pair {
        int numerator;
        int denominator;
        float val;
        Pair(int x, int y, float z){
            this.numerator = x;
            this.denominator = y;
            this.val = z;
        }
    }

    static class CustomComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            return Float.compare(o1.val, o2.val);
        }
    }

    public int[] solve(int[] A, int B) {
        int n = A.length;
        ArrayList<Pair> fractions = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                float value = (float) A[i] / (float) A[j];
                fractions.add(new Pair(A[i], A[j], value));
            }
        }

        fractions.sort(new CustomComparator());

        int[] ans = new int[2];
        Pair result = fractions.get(B - 1);

        ans[0] = result.numerator;
        ans[1] = result.denominator;

        return ans;
    }
}
