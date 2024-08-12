package BinarySearch;

public class BinarySearchIterative {
    public static Integer binarySearchIterative(int[] sortedArray, int l, int r, int elem) {
        Integer index = 0;

        while (l <= r) {
            Integer middle = ((l + r) / 2);

            if (sortedArray[middle] < elem) {
                l = middle + 1;
            } else if (sortedArray[middle] > elem) {
                r = middle - 1;
            } else if (sortedArray[middle] == elem) {
                index = elem;
                break;
            }
        }
        return index;
    }

    
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer l = 0;
        Integer r = 9;
        int elem = 7;

        System.out.println(binarySearchIterative(sortedArray, l, r, elem));
    }
}

// {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} // 7
