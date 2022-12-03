// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
import java.util.*;

public class task3
{
    public static void main(String[] args) { 
        ArrayList<Integer> nums = new ArrayList<>();
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            nums.add(rn.nextInt(100));
        } 
        System.out.println(nums);
        
        int total = 0;
        int min = nums.get(0);
        int max = nums.get(0);
        
        for (int j = 0; j < nums.size(); j++ ) {
            if (nums.get(j) > max) {
                max = nums.get(j);
            } else if (nums.get(j) < min) {
                min = nums.get(j);
            }
            total += nums.get(j); 
        }
        int average = total / nums.size();
        System.out.printf("Min = %d \n", min);
        System.out.printf("Max = %d \n", max);
        System.out.printf("Average = %d \n", average);
    }
}