package com.Strings;

public class LongestCommonPrefix {
    public static String solve(String[] strs){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i< strs[0].length(); i++){
            for(String s: strs){
                if(i == s.length() || s.charAt(i) != strs[0].charAt(i)){
                    return result.toString();
                }
            }
            result.append(strs[0].charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        // output: "fl"
        System.out.println(solve(arr));
    }
}
