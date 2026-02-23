public class UC3 {
    public static void main(String[] args) {
        // UC3: Palindrome Check Using String Reverse
        String original = "radar";
        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome!");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

}
