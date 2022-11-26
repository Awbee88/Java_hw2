package sem1;

import java.util.Scanner;

// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение
// чисел от 1 до n)

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int triangle = 0;
        for (int i = 1; i <= n; i++) {
            triangle = i + triangle;
        }
        System.out.printf("Треугольное число числа %d = %d", n, triangle);
        System.out.println();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.printf("Факториал числа %d = %d", n, fact);
    }
}
