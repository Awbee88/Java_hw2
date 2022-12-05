import java.util.Scanner;
import java.util.Stack;

// 3*. Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи. 
// Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
// Например:
// 5 4 3 - + => 5 1 + => 6

public class t3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные операции в обратной польской записи: ");
        String[] op = scanner.nextLine().split(" ");
        scanner.close();

        Stack<Integer> stack = new Stack<>();
        int res = 0;

        for (int i = 0; i < op.length; i++) {

            if (isDigit(op[i])) {
                stack.push(Integer.parseInt(op[i]));
            } else {
                switch (op[i]) {
                    case "+":
                        res = stack.pop() + stack.pop();
                        stack.push(res);
                        break;
                    case "-":
                        res = stack.pop() - stack.pop();
                        stack.push(res);
                        break;
                    case "*":
                        res = stack.pop() * stack.pop();
                        stack.push(res);
                        break;
                    case "/":
                        res = stack.pop() / stack.pop();
                        stack.push(res);
                        break;
                }
            }
        }
        System.out.printf("Result = %d\n", stack.pop());
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
