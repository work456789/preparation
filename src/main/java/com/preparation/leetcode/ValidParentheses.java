package com.preparation.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()[]"));
    }

    public boolean isValid(String s) {
        Deque<Character> stackOfParentheses = new ArrayDeque<>();
        char[] stringChars = s.toCharArray();
        for (char c : stringChars) {
            if (c == '(') {
                stackOfParentheses.push(')');
            } else if (c == '[') {
                stackOfParentheses.push(']');
            } else if (c == '{') {
                stackOfParentheses.push('}');
            } else if (stackOfParentheses.isEmpty() || stackOfParentheses.pop() != c) {
                return false;
            }
        }
        return stackOfParentheses.isEmpty();
    }
}
