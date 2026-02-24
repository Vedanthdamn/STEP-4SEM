import java.util.*;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "civic";
        Queue<Character> q = new LinkedList<>();
        Stack<Character> s = new Stack<>();

        for (char c : str.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                q.add(c);
                s.push(c);
            }
        }

        boolean flag = true;
        while (!q.isEmpty()) {
            if (!q.remove().equals(s.pop())) {
                flag = false;
                break;
            }
        }

        System.out.println("Input : " + str);
        System.out.println("Is Palindrome? : " + flag);
    }
}