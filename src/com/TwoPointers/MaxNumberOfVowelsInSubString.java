package com.TwoPointers;

public class MaxNumberOfVowelsInSubString {
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static int solve(String s, int k) {
        int count = 0;

        for(int i = 0; i < k; i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }

        int maxVowels = count;

        for(int i = k; i< s.length(); i++) {
            if(isVowel(s.charAt(i - k))){
                count--;
            }

            if(isVowel(s.charAt(i))){
                count++;
            }

            maxVowels = Math.max(maxVowels, count);
        }

        return maxVowels;
    }

    public static void main(String[] args) {
        String str = "abciiidef";

        System.out.println(solve(str, 3));
    }
}
