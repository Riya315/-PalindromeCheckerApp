import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UC6 {
    public static void main(String[] args) {
        // UC6: Queue + Stack Based Palindrome Check
        String word = "racecar";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and push all characters
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);      // FIFO: first in remains first
            stack.push(ch);     // LIFO: last in will be first out
        }

        // Compare dequeue (FIFO) vs pop (LIFO reverse)
        boolean isPalindrome = true;
        for (int i = 0; i < word.length(); i++) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}

