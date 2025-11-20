package Arrays;

public class ArrayIndex {
    public static int indexAt(int[] array, double i) {
        int index = (int) i;
        return array[index];
    }
    public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40};
    System.out.println(indexAt(numbers, 2.7)); // Should print 30
}
}
