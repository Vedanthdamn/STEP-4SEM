import java.util.*;

public class UseCase13PalindromeCheckerApp {

    static boolean check(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;
        return check(s, l + 1, r - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();
        String str = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        long start = System.nanoTime();
        boolean result = check(str, 0, str.length() - 1);
        long end = System.nanoTime();

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + (end - start) + " ns");
    }
}