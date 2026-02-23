public class UC2 {
    public static void main(String[] args) {
        // UC2: Hardcoded Palindrome Check
        String word = "madam";
        String reversed = "";

        // Reverse the string manually
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if palindrome and print result
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}

