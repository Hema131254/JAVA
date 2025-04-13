import java.util.*;
public class infixtopostfix {
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static String infixToPostfix(String expression) {
        String result = "";
  Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); ++i) {
            char c = expression.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                result += c;
            }
            else if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        String expression = sc.nextLine();
        System.out.println("Infix: " + expression);
        System.out.println("Postfix: " + infixToPostfix(expression));
    }
}
