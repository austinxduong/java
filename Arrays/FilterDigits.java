package Arrays;

import java.util.Arrays;

public class FilterDigits {
	public static int[] filterByLength(int[] numbers, int length) {
        
		int[] size = new int[numbers.length];
        
		for(int i = 0; i < numbers.length; i++) {
             
			
			String stringLength = String.valueOf(numbers[i]);
				
			if (stringLength.length() == length) {
				size[i] += numbers[i];
			}
		}
		return size;
       
	}

    public static void main(String[] args) {
        int[] numbers = {111, 222, 333, 444, 555, 67855, 10222};
        int length = 3;

        System.out.println(Arrays.toString(filterByLength(numbers, length)));
    }
}

// [111, 222, 333, 444, 555, 0, 0]