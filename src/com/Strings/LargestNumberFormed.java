package com.Strings;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFormed {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};

        String[] stringNums = new String[nums.length];
        for (int i = 0; i< nums.length; i++) {
            stringNums[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(stringNums, (str1, str2) -> (str2 + str1).compareTo(str1 + str2));

        if(stringNums[0].equals("0")) System.out.println("0");;

        StringBuilder result = new StringBuilder();
        for (String str: stringNums) {
            result.append(str);
        }
    }
}
