package Stack;

import java.util.Stack;

public class StackStringReverse {

    // Static method to push characters onto the stack
    private static void pushCharacters(Stack<Character> stack, String input) {
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
    }

    // Static method to pop characters from the stack and construct the reversed string
    private static String popAndConstructString(Stack<Character> stack) {
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        return reversedString.toString();
    }

    // Static method to reverse a string using a stack
    public static String reverseString(String input) {
        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push characters onto the stack
        pushCharacters(stack, input);

        // Pop characters from the stack to construct the reversed string
        return popAndConstructString(stack);
    }

    public static void main(String[] args) {
        // Example usage
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}