package com.Strings;

import java.util.Arrays;

public class ReverseWordsInStrings {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            result.append(words[i].toCharArray());
            if(i != 0) {
                result.append(" ");
            }
        }

//        System.out.println(result);

        return result.toString();
    }
    public static void main(String[] args) {
        String str = "a good   example";
        System.out.println(reverseWords(str));
    }
}
