package com.Strings;

import java.util.Stack;

public class RemoveKDigits {
    public static String removeKDigits(String num, int k) {
        int len = num.length();

        if(k == len) return "0";

        Stack<Character> stack = new Stack<>();
        for(char digit: num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        result.reverse();

        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String str = "1432219";
        int k = 3;

        System.out.println(removeKDigits(str, k));
    }
}
