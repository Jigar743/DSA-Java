package com.Hashing;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "aacc";
        String str2 = "ccac";
        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String s, String t){
        HashMap<Character, Integer> freqMap1 = new HashMap<>();
        HashMap<Character, Integer> freqMap2 = new HashMap<>();

        if(s.length() != t.length()) return false;
        int n = s.length();

        for(int i = 0; i< n; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            freqMap1.put(ch1, freqMap1.getOrDefault(ch1, 0) + 1);
            freqMap2.put(ch2, freqMap2.getOrDefault(ch2, 0) + 1);
        }

//        System.out.println(freqMap1);
//        System.out.println(freqMap2);
//
//        System.out.println();

        return freqMap1.equals(freqMap2);
    }
}
