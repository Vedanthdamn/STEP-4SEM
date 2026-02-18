// UseCase3PalindromeCheckerApp.java

import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // 1. Read input string from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("UC3: Palindrome Check Using String Reverse");
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println("Result: \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + original + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}
