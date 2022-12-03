// Реализовать алгоритм сортировки слиянием.
import java.util.*;

public class task1
{
    public static void main(String[] args) {
        
        int[] nums = new int[] {23, 11, 4, 5, 76, 55, -123, 1234, 3};
        int[] newNums = mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(newNums));
    }
    
    private static int[] mergeSort(int[] arr, int start, int finish) {
        if (start == finish) {
            return new int[] { arr[start] }; 
        }
        int mid = (start + finish) / 2;
        int[] left = mergeSort (arr, start, mid);
        int[] right = mergeSort (arr, mid + 1, finish);
        int[] res = new int[finish - start + 1];
        
        int leftIndex = 0;
        int rightIndex  = 0;
        for (int resIndex = 0; resIndex < res.length; resIndex++ ) {
            if (leftIndex >= left.length) {
                res[resIndex] = right[rightIndex];
                rightIndex++;
            } else if (rightIndex >= right.length) {
                res[resIndex] = left[leftIndex];
                leftIndex++;
            }
            else if (left[leftIndex] < right[rightIndex]) {
                res[resIndex] = left[leftIndex];
                leftIndex++;
            } else {
                res[resIndex] = right[rightIndex];
                rightIndex++;
            }
        } 
        
        return res;
    }
}