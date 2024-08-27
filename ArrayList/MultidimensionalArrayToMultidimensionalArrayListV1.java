package ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class MultidimensionalArrayToMultidimensionalArrayListV1 {
    public static ArrayList<LinkedHashSet<Integer>> multidimensionalArrayToMultidimensionalArrayListV1(int[][] array, int integerr) {

    ArrayList<LinkedHashSet<Integer>> arrayListInteger = new ArrayList<LinkedHashSet<Integer>>();

    for (int i = 0; i < array.length; i++) {
        
        LinkedHashSet<Integer> subArrays = new LinkedHashSet<Integer>();
        for (int a = 0; a < array[i].length; a++) {
            
            subArrays.add(array[i][a]);
            
            }
            arrayListInteger.add(subArrays);
        }
        return arrayListInteger; 
        }

    public static void main (String[] args) {
        int[][] array = {{3, 4, 4, 4, 4}, {8, 3, 3, 2}, {}, {9, 3}, {5, 3}, {4, 3}};
        int integerr = 3;

        System.out.println(multidimensionalArrayToMultidimensionalArrayListV1(array, integerr));
    }
}


// {{3, 4, 4}, {8, 3, 3, 2}, {}, {9, 3}, {5, 3}, {4, 3}}, 3 // [[3, 4], [8, 3, 2], [], [9, 3], [5, 3], [4, 3]]
// {{3, 4, 4, 4, 4}, {8, 3, 3, 2}, {}, {9, 3}, {5, 3}, {4, 3}} // [[3, 4], [8, 3, 2], [], [9, 3], [5, 3], [4, 3]]
// {{3, 4, 4, 4, 4}, {8, 3, 3, 2}, {7, 7, 7}, {9, 3}, {5, 3}, {4, 3}} // [[3, 4], [8, 3, 2], [7], [9, 3], [5, 3], [4, 3]]