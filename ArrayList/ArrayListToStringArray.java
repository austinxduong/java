package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToStringArray {
    public static String[] dOccurences(int min, int max, int digit) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); 

        for (int i = min; i < max; i += 1) {
            arrayList.add(min += 1);
        }

        Integer[] arr = new Integer[arrayList.size()];
                 arr = arrayList.toArray(arr);

        String d = Arrays.toString(arr);         

        String[] ar = d.substring(1, d.length() -1).split(", ");

        


        return ar;
    }

    

    public static void main(String[] args) {
        int min = 20;
        int max = 25;
        int digit = 2;

        System.out.println(Arrays.toString(dOccurences(min, max, digit)));
    }
}