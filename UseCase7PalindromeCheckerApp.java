import java.util.*;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String str = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                deque.addLast(c);
            }
        }

        boolean flag = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                flag = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + flag);
    }
}