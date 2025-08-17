package com.Strings;

public class IsPalindromeString {
    public static boolean isPalindrome(String a) {
        String s = a.toLowerCase();
        int left = (s.length() - 1) / 2;
        int right = s.length() / 2;

        while (left >= 0 & right <= s.length()){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left--;
            right++;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Jigar"));
        System.out.println(isPalindrome("Naman"));
    }
}
