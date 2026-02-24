import java.util.*;

public class UseCase9PalindromeCheckerApp {

    static boolean check(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;
        return check(s, l + 1, r - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String str = sc.nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");
        boolean flag = check(str, 0, str.length() - 1);
        System.out.println("Is Palindrome? : " + flag);
    }
}