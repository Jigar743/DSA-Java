package com.Strings;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> solve(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();

        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String sortedWord = new String(chars);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solve(arr));
    }
}
