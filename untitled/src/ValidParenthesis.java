/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * An input string is valid if:
 * - Open brackets must be closed by the same type of brackets.
 * - Open brackets must be closed in the correct order.
 * - Every close bracket has a corresponding open bracket of the same type.

 * Constraints:
 * - 1 <= s.length <= 104
 * - s consists of parentheses only '()[]{}'.
 */

// Reverse Polish Notation - just internalize

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0 || s.isEmpty()) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();

        Map <Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put('}', '{');
        pairs.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If char is closing parenthesis
            if (pairs.containsKey(c)) {
                // Add dummy variable in case of empty stack (to avoid EmptyStackException)
                char top = stack.empty() ? '#' : stack.pop();
                // If value for parenthesis doesn't match top element, return false
                if (top != pairs.get(c)) {
                    return false;
                }
            } else {
                // Push to the stack if it's opening parenthesis
                stack.push(c);
            }
        }
        // If there are still elements in the stack, s is invalid expression
        return stack.empty();
    }
}