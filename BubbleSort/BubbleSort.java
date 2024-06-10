package BubbleSort;
import java.util.Arrays;

public class BubbleSort {
    public static int[] ArraySort(int[] nums) {
        
        int n = nums.length;
        int temp = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (nums[j - 1] > nums[j]) {
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {10, 13, 55, 100, 32, 1, 8, 2, 18};
        
        System.out.println("Sorted Array:" + " " + Arrays.toString(ArraySort(nums)));
    }
}


// Sorted Array: [1, 2, 8, 10, 13, 18, 32, 55, 100]