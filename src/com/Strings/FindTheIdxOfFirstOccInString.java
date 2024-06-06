package com.Strings;

public class FindTheIdxOfFirstOccInString {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        int n = haystack.length(), m = needle.length();

        for (int i = 0; i < n - m + 1; i++) {
//            if (haystack.substring(i, i + m).equals(needle))
//                return i;
            for(int j = i; j < i + m; j++){
                if(haystack.charAt(j) != needle.charAt(j - i))
                    break;
                if(j == i + m - 1)
                    return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String str1 = "hello", str2 = "ll";
        System.out.println(strStr(str1, str2));
    }
}
