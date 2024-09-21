package com.Strings;

public class MergeStringAlternately {
    public static String mergeString(String word1, String word2) {
        StringBuilder resultString = new StringBuilder();

        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if(i < word1.length()) {
                resultString.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                resultString.append(word2.charAt(i));
            }
            i++;
        }

        return resultString.toString();
    }
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "pq";

        System.out.println(mergeString(str1, str2));
    }
}
