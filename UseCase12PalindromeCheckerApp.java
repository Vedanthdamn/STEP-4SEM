import java.util.*;

interface PalindromeStrategy {
    boolean check(String s);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String s) {
        Stack<Character> st = new Stack<>();
        Queue<Character> q = new LinkedList<>();
        for (char c : s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray()) {
            st.push(c);
            q.add(c);
        }
        while (!q.isEmpty()) {
            if (!q.remove().equals(st.pop())) return false;
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean check(String s) {
        Deque<Character> d = new ArrayDeque<>();
        for (char c : s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray()) {
            d.add(c);
        }
        while (d.size() > 1) {
            if (!d.removeFirst().equals(d.removeLast())) return false;
        }
        return true;
    }
}

public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String str = sc.nextLine();
        PalindromeStrategy strategy = new StackStrategy();
        System.out.println("Is Palindrome? : " + strategy.check(str));
    }
}