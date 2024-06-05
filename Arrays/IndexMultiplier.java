package ET;

public class IndexMultiplier{
    public static int IndexArray(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i] * i;
        }
        return total;
    }
}
