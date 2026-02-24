import java.util.*;

public class UseCase10PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String str = sc.nextLine().toLowerCase().replaceAll("\\s+", "");
        String rev = new StringBuilder(str).reverse().toString();
        boolean flag = str.equals(rev);
        System.out.println("Is Palindrome? : " + flag);
    }
}