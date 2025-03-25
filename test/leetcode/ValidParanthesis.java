package com.test.leetcode;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String args[]) {
        ValidParanthesis validParanthesis = new ValidParanthesis();
        System.out.println(validParanthesis.isValid("]"));
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(' || c == '[' || c == '{') {
                st.push(s.charAt(i));
            } else if (!st.empty() && ((st.peek() == '(' && c == ')') || (st.peek() == '[' && c == ']') || (st.peek() == '{' &&
                        c == '}'))) {
                    st.pop();
            } else {
                return false;
            }
        }
        return st.empty();
    }
}
