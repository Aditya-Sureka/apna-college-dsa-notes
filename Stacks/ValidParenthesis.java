package Stacks;

import java.util.*;

public class ValidParenthesis {
    public static boolean isValid(String str) { // O(n)
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                if (s.isEmpty()) { // closing
                    return false;
                }

                if ((s.peek() == '(' && ch == ')') // ()
                        || (s.peek() == '[' && ch == ']') // []
                        || (s.peek() == '{' && ch == '}')) { // {}
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        if (s.isEmpty()) {
            return true;
        } else { // if some of the braces still remain in stack
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "({})[]"; // true
        System.out.println(isValid(str));

    }

}
