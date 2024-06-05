package Arrays;

public class ModulusArray {
    public static int[] modulus(int[] arr, int num) {
        int[] modulusArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            modulusArray[i] = arr[i] % num;
        }
        return modulusArray;
    }
}
