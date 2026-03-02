import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // 1️⃣ Iterative Two-Pointer Method
    public static boolean iterativeCheck(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // 2️⃣ Recursive Method
    public static boolean recursiveCheck(String input, int start, int end) {
        if (start >= end)
            return true;

        if (input.charAt(start) != input.charAt(end))
            return false;

        return recursiveCheck(input, start + 1, end - 1);
    }

    // 3️⃣ Stack-Based Method
    public static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC13: Palindrome Performance Comparison ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize string (ignore spaces & case)
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Iterative Timing
        long start1 = System.nanoTime();
        boolean result1 = iterativeCheck(input);
        long end1 = System.nanoTime();

        // Recursive Timing
        long start2 = System.nanoTime();
        boolean result2 = recursiveCheck(input, 0, input.length() - 1);
        long end2 = System.nanoTime();

        // Stack Timing
        long start3 = System.nanoTime();
        boolean result3 = stackCheck(input);
        long end3 = System.nanoTime();

        System.out.println("\n--- Performance Results ---");
        System.out.println("Iterative Result: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Recursive Result: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Stack Result: " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        scanner.close();
    }
}

