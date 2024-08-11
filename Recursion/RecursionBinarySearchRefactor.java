package Recursion;

public class RecursionBinarySearchRefactor {
    public static boolean recursionBinarySearchRefactor(int[] sortedArray, int l, int r, int elem) {
    Integer middle = ((l + r) / 2);


    if (l > r) {
        return false;
    }

    if (elem < sortedArray[middle]) {
            return recursionBinarySearchRefactor(sortedArray, l, middle - 1, elem);
    } else if (elem > sortedArray[middle]) {
            return recursionBinarySearchRefactor(sortedArray, middle + 1, r, elem);
    }
    return true;

}


    public static void main(String[] args) {
        int[] sortedArray = {20, 1067, 5032, 10005, 20333, 36798, 45234, 55555, 64123, 99999};
        int l = 0;
        int r = 9;
        int elem = 64123;

        System.out.println(recursionBinarySearchRefactor(sortedArray, l, r, elem));
    }
}

// {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 0 , 9, 7; // true;
// {3, 6, 14, 15, 17, 18, 22, 43, 55, 66}, 0, 9, 19; false;
// {4, 8, 12, 16, 20, 24, 28, 32, 36, 40}, 0, 9, 32 // true;
// {3, 6, 9, 12, 15, 18, 21, 24, 27, 30}, 0, 9, 31 // false;
// {20, 1067, 5032, 10005, 20333, 36798, 45234, 55555, 64123, 99999}, 0, 9, 64123 // true;
