package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToIntegerArray {
    public static Integer[] dOccurences(int min, int max) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        for (int i = min; i < max; i += 1) {
            arrayList.add(min += 1);
        }

        Integer[] arr = new Integer[arrayList.size()];
                 arr = arrayList.toArray(arr);

        return arr;
    }

    

    public static void main(String[] args) {
        int min = 20;
        int max = 25;
    
        System.out.println(Arrays.toString((dOccurences(min, max))));
    }
}

// [21, 22, 23, 24, 25]