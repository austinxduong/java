package Arrays;
import java.util.Arrays;

public class ArraySort {
    public static int[] ArraySortAsc(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }


public static void main(String[] args){
    int[] arrays = {-14, 0, 1, 13, 32, 5, 8, 10, 55, 100, 235};
    System.out.println("Sorted Arrays Asc:" + " "  +Arrays.toString(ArraySortAsc(arrays)));
}
}

// [-14, 0, 1, 5, 8, 10, 13, 32, 55, 100, 235]