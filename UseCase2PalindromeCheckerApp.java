// UseCase2PalindromeCheckerApp.java

public class UseCase2PalindromeCheckerApp {

    // main method: entry point of the application
    public static void main(String[] args) {

        // hardcoded string literal
        String word = "madam";

        // reverse the string
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // conditional check: is it a palindrome?
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
