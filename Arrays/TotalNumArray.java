package ET;

public class TotalNumArray {
    public static int arrayTotal(int[] arr) {
        int total = 0;

        for (int keyValue : arr) {
            total += keyValue;
        }
        return total;
    }
}
// adds all elements within an array and computes a total