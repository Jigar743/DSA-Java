package com.Strings;

public class IsSubsequence {
    public static boolean solve(String s, String t) {
        int pt1 = 0, pt2 = 0;

        while (pt1 < s.length() && pt2 < t.length()) {
            if (s.charAt(pt1) == t.charAt(pt2))
                pt1++;

            pt2++;
        }

        if(pt1 == s.length()) return true;
        return false;
    }
    public static void main(String[] args) {
        String str1 = "ace";
        String str2 = "abcde";

        System.out.println(solve(str1, str2));
    }
}
