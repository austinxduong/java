package Arrays;

import java.util.Arrays;

public class MultidimensionalArray {
    public static char[][] alphabetCounter(char[][] arr, char c) {
        for (int d = 0; d < arr.length; d++) {
            for (int e = 0; e < arr[d].length; e++) { 
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        char[][] arr = { {'A', 'B', 'C', 'D'}, {'D', 'E', 'F', 'G'}};
        char c = 'D';
        System.out.println(Arrays.deepToString(alphabetCounter(arr, c)));
    }
}

//[[A, B, C, D], [D, E, F, G]]