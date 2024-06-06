package com.BinarySearch;

public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long left = 2, right = num / 2;

        while (left <= right) {
            long mid = (left + right) / 2;
            long guessSquared = mid * mid;

            if (guessSquared == num)
                return true;
            if (guessSquared > num)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return false;
    }
    public static void main(String[] args) {
        int num = 14;
        System.out.println(isPerfectSquare(num));
    }
}
