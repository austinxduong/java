package Arrays;

import java.util.Arrays;

public class CopyOfArray {
    public static Object[] copyOfArray(Object[] array) {

    Object[] copy = Arrays.copyOf(array, array.length + 1);

    copy[copy.length -1] = array;
    
    return copy;
    }

    public static void main(String[] args) {
        Object[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.deepToString(copyOfArray(arr)));
    }
}

//[1, 2, 3, 4, 5, 6, 7, 8, [1, 2, 3, 4, 5, 6, 7, 8]]
