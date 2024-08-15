package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Arrays;

public class LinkedHashSetDuplicateInteger {
    public static int[] linkedHashSetInteger(int[] integers) {

        LinkedHashSet<Integer> linkedHashSetIntegers = new LinkedHashSet<Integer>();

        for (Integer i = 0; i < integers.length; i++) {
            linkedHashSetIntegers.add(integers[i]);
        }
        int[] integerArray = new int[linkedHashSetIntegers.size()];
        Integer index = 0;

        for (int e : linkedHashSetIntegers) {
            integerArray[index++] = e;
        }

        return integerArray;
    }

    public static void main(String[] args) {

        int[] integers  = {1, 2, 2, 2, 3, 2, 5, 2, 6, 6, 3, 7, 1, 2, 5};

        System.out.println(Arrays.toString(linkedHashSetInteger(integers)));
    }
}

// {1, 2, 2, 2, 3, 2, 5, 2, 6, 6, 3, 7, 1, 2, 5} // [1, 2, 3, 5, 6, 7]