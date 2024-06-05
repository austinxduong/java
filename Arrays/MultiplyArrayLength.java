package ET;

public class MultiplyArrayLength {
    public static int[] MultiplyArrayElements(int[] arr) {
        int[] array = new int[arr.length];
        int size = arr.length;
        for(int i = 0; i < array.length; i++) {
            array[i] = arr[i] * size;
        }
        return array;
    }
}