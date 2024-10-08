package ArrayList;

import java.util.ArrayList;

public class MultidimensionalArrayToMultidimensionalArrayList {
    public static ArrayList<ArrayList<Integer>> multidimensionalArrayToMultidimensionalArrayList(int[][] array, int integerr) {

ArrayList<ArrayList<Integer>> arrayListInteger = new ArrayList<ArrayList<Integer>>();

for (int i = 0; i < array.length; i++) {
    ArrayList<Integer> subArrays = new ArrayList<Integer>();

    for (int a = 0; a < array[i].length; a++) {
        subArrays.add(array[i][a]);
    }

    arrayListInteger.add(subArrays);

        }
    return arrayListInteger; // [[3, 4], [8, 3, 2], [], [9, 3], [5, 3], [4, 3]]
    }

    public static void main (String[] args) {
        int[][] array = {{3, 4}, {8, 3, 2}, {}, {9, 3}, {5, 3}, {4, 3}};
        int integerr = 3;

        System.out.println(multidimensionalArrayToMultidimensionalArrayList(array, integerr));
    }
}
