import java.util.Scanner;

public class PalindromeCheckerApp {


    public static boolean isPalindromeRecursive(String str, int start, int end) {


        if (start >= end) {
            return true;
        }


        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }


        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App (Recursive Method) ===");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();


        input = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindromeRecursive(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}