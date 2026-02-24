import java.util.*;

class PalindromeChecker {
    boolean checkPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
}

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String str = sc.nextLine();
        PalindromeChecker pc = new PalindromeChecker();
        System.out.println("Is Palindrome? : " + pc.checkPalindrome(str));
    }
}