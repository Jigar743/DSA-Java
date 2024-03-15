package com.Strings;

import java.util.ArrayList;

public class PrintSubStrings {
    public static void main(String[] args) {
        System.out.println(solve("Jigar"));
    }

    public static ArrayList<ArrayList<String>> solve(String str){
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        for(int i = 0; i< str.length(); i++){
            StringBuilder strBuilder = new StringBuilder();
            ArrayList<String> arr = new ArrayList<>();
            for (int j = i; j< str.length(); j++){
                strBuilder.append(str.charAt(j));
                arr.add(strBuilder.toString());
            }
            result.add(arr);
        }

        return result;
    }
}
