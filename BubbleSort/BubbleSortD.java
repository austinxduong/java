package BubbleSort;
import java.util.Arrays;

public class BubbleSortD {
    public static int[] arrayD(int[] nums) {
        for (int a = 0; a < nums.length; a++) {
            for (int d = 0; d < nums.length; d++) {
                if (nums[a] < nums[d]) {
                    int flag;
                    flag = nums[a];
                    nums[a] = nums[d];
                    nums[d] = flag;
                }
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = {-2, 0, 1, 3, 10, 18, 16, 25};
        System.out.println("Sorted Arrays:" + " " +Arrays.toString(arrayD(nums)));
    }
}

//Sorted Arrays: [-2, 0, 1, 3, 10, 16, 18, 25]