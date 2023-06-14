import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ParenthesesBalanceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of parentheses you want to check: ");
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading N

        List<String> parenthesesList = new ArrayList<>();

        // Read N parentheses strings
        System.out.println("\nYour parentheses: ");
        for (int i = 0; i < N; i++) {
            String parentheses = scanner.nextLine();
            parenthesesList.add(parentheses);
        }

        // Process and print the balance status of parentheses
        System.out.println("\nAssessment: ");
        for (String parentheses : parenthesesList) {
            if (isBalanced(parentheses)) {
                System.out.println("BALANCED");
            } else {
                System.out.println("NOT BALANCED");
            }
        }
    }

    private static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();

        for (char ch : parentheses.toCharArray()) {
            if (ch == '(' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}') {
                if (stack.isEmpty()) {
                    // Found closing parenthesis without matching opening parenthesis
                    return false;
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{')) {
                    // Mismatched opening and closing parenthesis
                    return false;
                }
            }
        }

        // Stack should be empty for balanced parentheses
        return stack.isEmpty();
    }
}
