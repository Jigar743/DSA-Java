package com.SortingAlgo;
import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] nums, int[] arr1, int[] arr2){
        int arrIdx = 0, leftIdx = 0, rightIdx = 0;

        while (leftIdx < arr1.length && rightIdx < arr2.length){
            if(arr1[leftIdx] < arr2[rightIdx]){
                nums[arrIdx] = arr1[leftIdx];
                leftIdx++;
            }else{
                nums[arrIdx] = arr2[rightIdx];
                rightIdx++;
            }
            arrIdx++;
        }

        while (leftIdx < arr1.length){
            nums[arrIdx] = arr1[leftIdx];
            leftIdx++;
            arrIdx++;
        }

        while (rightIdx < arr2.length){
            nums[arrIdx] = arr2[rightIdx];
            rightIdx++;
            arrIdx++;
        }
    }

    public static void mergeSort(int[] nums){
        if (nums.length <= 1) return;

        int mid = (nums.length) / 2;
        int[] leftArr = Arrays.copyOfRange(nums, 0, mid);
        int[] rightArr = Arrays.copyOfRange(nums, mid, nums.length);
        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(nums, leftArr, rightArr);
    }

    public static int[] sortArray(int[] nums){
        mergeSort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
}
