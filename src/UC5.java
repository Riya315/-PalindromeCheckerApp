import java.util.Stack;

public class UC5 {
    public static void main(String[] args) {
        // UC5: Stack-Based Palindrome Checker
        String word = "deked";
        Stack<Character> stack = new Stack<>();

        // Push all characters to stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop and build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}

