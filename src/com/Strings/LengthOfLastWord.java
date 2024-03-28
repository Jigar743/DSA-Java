package com.Strings;

public class LengthOfLastWord {
    public static int lastWordLength(String str){
        String trimmedStr = str.trim();
        int count = 0;
        for (int i = trimmedStr.length() - 1; i >= 0; i--){
            if(trimmedStr.charAt(i) != ' '){
                count++;
            }else break;
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";

        System.out.println(lastWordLength(str));
    }
}
