// UseCase4PalindromeCheckerApp.java
import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    // UC4: Character Array Based Palindrome Check
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC4: Character Array Based Palindrome Check ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = isPalindromeUsingCharArray(input);

        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }

    /**
     * Checks if the given string is a palindrome using:
     * - char[]
     * - two-pointer technique
     */
    private static boolean isPalindromeUsingCharArray(String text) {
        if (text == null) {
            return false;
        }
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        // 1. Convert string to char[]
        char[] chars = normalized.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
