package com.Stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class RemovingStarsFromString {
    public static String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch: s.toCharArray()){
            if(ch != '*'){
                stack.addLast(ch);
            }else {
                if(!stack.isEmpty()){
                    stack.removeLast();
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.removeFirst());
        }

        return sb.toString();

//        Stack<Character> stack = new Stack<>();
//
//        for (char ch: s.toCharArray()){
//            if(ch != '*'){
//                stack.push(ch);
//            }else {
//                if(!stack.isEmpty()){
//                    stack.pop();
//                }
//            }
//        }
//
//        System.out.println(stack);
//
//        StringBuilder sb = new StringBuilder();
//
//        while (!stack.isEmpty()) {
//            sb.append(stack.pop());
//        }
//
//        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String str = "leet**cod*e";
        System.out.println(removeStars(str));
    }
}
