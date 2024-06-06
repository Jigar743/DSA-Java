package com.BinarySearch;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n-1;
        int ans = 0;

        while(l <= r){
            int mid = (l+r) / 2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
                ans = l;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }
}
