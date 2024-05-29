package ET;

public class MaxInteger {
    public static int findsLargestInt(int[] nums) {
        int max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}

