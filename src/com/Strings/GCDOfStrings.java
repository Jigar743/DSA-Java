package com.Strings;

import java.util.HashSet;

public class GCDOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if(str2.length() > str1.length()) {
            return gcdOfStrings(str2, str1);
        }

        if(str2.equals(str1)) return str2;

        if(str1.startsWith(str2)) {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }

        return "";
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";

        System.out.println(gcdOfStrings(str1, str2));
    }
}
