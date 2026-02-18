import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    private static boolean isPalindromeUsingStack(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < normalized.length(); i++) {
            stack.push(normalized.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return normalized.equals(reversed.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("UC5: Stack-Based Palindrome Checker");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = isPalindromeUsingStack(input);
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome (Stack-based check).");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome (Stack-based check).");
        }

        scanner.close();
    }
}
