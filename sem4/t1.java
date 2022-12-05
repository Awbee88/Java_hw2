
import java.util.LinkedList;
import java.util.Random;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class t1 {
    public static void main(String[] args) {

        LinkedList<Integer> nums = new LinkedList<>();
        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
            nums.add(rd.nextInt(100));
        }
        System.out.println(nums);
        System.out.println(reverseList(nums));
    }

    private static LinkedList<Integer> reverseList(LinkedList<Integer> numbers) {

        LinkedList<Integer> newNums = new LinkedList<>();
        int size = numbers.size();

        for (int i = 0; i < size; i++) {
            newNums.add(numbers.pollLast());
        }

        return newNums;
    }
}
