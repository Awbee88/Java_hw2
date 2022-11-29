package sem2;

import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class task2 {
    public static void main(String[] args) {
        Logger log = Logger.getLogger("task2");
        int[] nums = new int[] { 54, -12, 13, 45, 2, 566, -53, 1 };
        int temp;
        try {
            FileHandler fh = new FileHandler("sem2/bublesort.log");
            log.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    log.info(Arrays.toString(nums));
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
