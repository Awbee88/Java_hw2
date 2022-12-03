

// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
import java.util.*;

public class task2
{
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            nums.add(rn.nextInt(21));
        } 
        System.out.println(nums);
        for (int j = 0; j < nums.size(); j++) {
            if (nums.get(j) % 2 == 0) {
                nums.remove(j);
                j--;
            }
        }
        System.out.println(nums);
    }
}
