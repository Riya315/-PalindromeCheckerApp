public class UC1 {
    // Application Constants
    static final String APPLICATION_NAME = "Palindrome Checker App";
    static final String APPLICATION_VERSION = "Version 1.0";

    public static void main(String[] args) {

        displayWelcomeMessage();

        // Flow continues to next use case (future implementation)
        System.out.println();
        System.out.println("Application initialized successfully.");
        System.out.println("Proceeding to next use case...");
    }

    /**
     * Displays application name, version and welcome details.
     */
    public static void displayWelcomeMessage() {

        System.out.println("=============================================");
        System.out.println("              " + APPLICATION_NAME);
        System.out.println("              " + APPLICATION_VERSION);
        System.out.println("=============================================");
        System.out.println("Welcome to the Palindrome Checker Application!");
        System.out.println("This application validates whether a given string");
        System.out.println("is a palindrome under different conditions.");
        System.out.println("=============================================");
    }
}

