package ArrayList;

import java.util.ArrayList;

import java.util.Arrays;

public class FilterDigits {
    public static int[] filterByLength(int[] d, int length) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int eachD : d) {
            if (String.valueOf(eachD).length() == length) {
                arrayList.add(eachD);
            }
        }
        if (arrayList.size() == d.length) {
            return d;

        } else {
            int[] newList = new int[arrayList.size()];
            int index = 0;

            for (int D : arrayList) {
                newList[index] = D;
                index++;
            }
            return newList;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {111, 222, 333, 444, 555, 67855, 10222};
        int length = 3;

        System.out.println(Arrays.toString(filterByLength(numbers, length)));
    }
}

// [111, 222, 333, 444, 555];