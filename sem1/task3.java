package sem1;

import java.util.Scanner;

// 3. Реализовать простой калькулятор

public class task3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans = 0;
        char op;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = scan.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
               break;
            case '-': ans = num1 - num2;
               break;
            case '*': ans = num1 * num2;
               break;
            case '/': ans = num1 / num2;
               break;
            default:  System.out.printf("Error! Enter correct operator");
        }
        System.out.print("\nResult:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
