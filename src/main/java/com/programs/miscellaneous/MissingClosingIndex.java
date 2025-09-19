package com.programs.miscellaneous;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MissingClosingIndex {
    public static void main(String[] args) {
        String input = "([]){}([{})";
        List<Integer> missingIndex = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(i);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            missingIndex.add(stack.pop());
        }
        System.out.println("Missing Indices: " + missingIndex);
    }
}