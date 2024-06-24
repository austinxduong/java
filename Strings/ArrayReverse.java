package Strings;

import java.util.Arrays;

public class ArrayReverse {
    public static int[] ArrayInverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(Arrays.toString(ArrayInverse(arr)));
    }
}

// [100, 90, 80, 70, 60, 50, 40, 30, 20, 10]