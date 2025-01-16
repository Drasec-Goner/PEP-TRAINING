import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                default:
                    // If there are any characters other than the allowed ones
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] testStrings = {"[()]{}", "({()})", "({})", "{}(", "({)}", "[[", "H"};

        for (String s : testStrings) {
            System.out.println("String: " + s + " is " + (isBalanced(s) ? "balanced" : "not balanced"));
        }
    }
}
