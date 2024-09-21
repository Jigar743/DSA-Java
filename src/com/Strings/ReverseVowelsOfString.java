package com.Strings;

import java.util.HashSet;

public class ReverseVowelsOfString {
    public static boolean isVowel(char ch) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(ch) != -1;
    }
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !isVowel(chars[left])) {
                left++;
            }

            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
    public static void main(String[] args) {
        String str = "IceCream";
        System.out.println(reverseVowels(str));
    }
}
