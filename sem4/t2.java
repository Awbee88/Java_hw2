import java.util.LinkedList;
import java.util.Random;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class t2 {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
            nums.add(rd.nextInt(100));
        }
        System.out.println(nums);

        enqueue(nums, 77);
        System.out.println(nums);

        System.out.println(dequeue(nums));
        System.out.println(nums);

        System.out.println(first(nums));
        System.out.println(nums);

    }

    private static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    private static Integer dequeue(LinkedList<Integer> list) {
        return list.pollFirst();
    }

    private static Integer first(LinkedList<Integer> list) {
        return list.getFirst();
    }
}
