public class UC4 {
    public static void main(String[] args) {
        // UC4: Character Array Based Palindrome Check
        String word = "level";
        char[] chars = word.toCharArray();
        boolean isPalindrome = true;

        // Two-pointer technique
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
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

