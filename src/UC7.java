import java.util.ArrayDeque;
import java.util.Deque;
public class UC7 {
    public static void main(String[] args) {
        // UC7: Deque-Based Optimized Palindrome Checker
        String word = "madamimadam";
        Deque<Character> deque = new ArrayDeque<>();

        // Insert all characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        // Compare front and rear until middle
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
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

