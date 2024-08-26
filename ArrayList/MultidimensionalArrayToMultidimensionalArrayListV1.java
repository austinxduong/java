package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MultidimensionalArrayToMultidimensionalArrayListV1 {
    public static LinkedHashSet<HashSet<Integer>> multidimensionalArrayToMultidimensionalArrayListV1(int[][] array, int integerr) {


    LinkedHashSet<HashSet<Integer>> arrayListInteger = new LinkedHashSet<HashSet<Integer>>();


    for (int i = 0; i < array.length; i++) {
    
        LinkedHashSet<Integer> subArrays = new LinkedHashSet<Integer>();

        for (int a = 0; a < array[i].length; a++) {
            // subArrays.add(array[i][a]);
            subArrays.add(array[i][a]);
            
        }

        // arrayListInteger.add(subArrays);
        arrayListInteger.add(subArrays);

            }
        return arrayListInteger; // [[3, 4], [8, 3, 2], [], [9, 3], [5, 3]]
        // expected output: [[3, 4], [8, 3, 2], [], [9, 3], [5, 3], [4, 3]]
        }

    public static void main (String[] args) {
        int[][] array = {{3, 4, 4, 4, 4}, {8, 3, 3, 2}, {}, {9, 3}, {5, 3}, {4, 3}};
        int integerr = 3;

        System.out.println(multidimensionalArrayToMultidimensionalArrayListV1(array, integerr));
    }
}

// {{3, 4, 4, 4, 4}, {8, 3, 3, 2}, {}, {9, 3}, {5, 3}, {4, 3}}