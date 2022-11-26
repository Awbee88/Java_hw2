package sem1;

// 2. Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1001; i++) {
            count = 0;
            for (int j = 1; j < i + 1; j++) {

                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.printf("%d ", i);
            }
        }
    }
}
