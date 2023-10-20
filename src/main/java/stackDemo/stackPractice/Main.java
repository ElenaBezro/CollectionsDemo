package stackDemo.stackPractice;

import java.util.stream.Collectors;

public class Main {


    public static boolean isBalancedParentheses(String string) {
        CustomStack<Character> parentheses = new CustomStack<>();
        char opening = '(';
        char closing = ')';
        for (char c : string.toCharArray()) {
            if (c == opening) {
                parentheses.push(c);
            } else if (c == closing && parentheses.peek() == opening) {
                parentheses.pop();
            }
        }
        return parentheses.isEmpty();
    }

    public static String reverseString(String string) {
        CustomStack<Character> characterStack = new CustomStack<>();
        for (int i = string.length() - 1; i >= 0; i--) {
            characterStack.push(string.charAt(i));
        }
        return characterStack.getStackList().stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);
        System.out.println("******");
        String s1 = "()()()";
        String s2 = "()(()";
        String s3 = "(()())";
        System.out.println(isBalancedParentheses(s1)); // true
        System.out.println(isBalancedParentheses(s2)); // false
        System.out.println(isBalancedParentheses(s3)); // true
    }
}
