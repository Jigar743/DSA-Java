package com.BinarySearch;

public class SearchElementInRotatedSortedArray {
    public static int solve(int[] A, int target) {
        int n = A.length;
        int l = 0, r = n - 1, mid;

        while (l <= r) {
            mid = (l + r) / 2;
            if (A[mid] == target) {
                return mid;
            }

            if (A[l] <= A[mid]) {
                if (A[l] <= target && target < A[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (A[mid] < target && target <= A[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(solve(arr, 0));
    }
}
