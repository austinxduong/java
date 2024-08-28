package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class OmnipresentIntegerV0 {
    public static ArrayList<LinkedHashSet<Integer>> omnipresentInteger(int[][] array, int integerr) {

        ArrayList<LinkedHashSet<Integer>> integerArrayList = new ArrayList<LinkedHashSet<Integer>>();
        for (int i = 0; i < array.length; i++) {

            LinkedHashSet<Integer> subArray = new LinkedHashSet<Integer>();

            for (int a = 0; a < array[i].length; a++) {
                
                    subArray.add(array[i][a]);
                   
                }
                integerArrayList.add(subArray);
            }
            
    //     int arraySize = array.length; // 6

    //     if (integerArrayList.size() < arraySize) {
    //         return false;
    //     }
    // }

// ArrayList<Integer> arrayList = new ArrayList<Integer>();

//     for (int e = 0; e < integerArrayList.size(); e++ ) {
//         for (int d = 0; d < integerArrayList.get(e).size(); d++)
//         if (integerArrayList.get(e)(d) == integerr) {
//         }
//     }
        
        // return true; // [3, 3, 3, 3, 3, 3]
      return integerArrayList;
            
    }


    public static void main(String[] args) {
        int[][] array = {{3, 4}, {8, 3, 3, 2}, {}, {9, 3}, {5, 3}, {4, 3}};
        int integerr = 3;
        System.out.println(omnipresentInteger(array, integerr));
    }
}


// {{3, 4}, {8, 3, 2}, {}, {9, 3}, {5, 3}, {4, 3} // false
// {{3, 4}, {8, 3, 2}, {3}, {9, 3}, {5, 3}, {4, 3}}, 3 // true
// {{1, 1}, {1, 3}, {5, 1}, {6, 1}} // true
// {{1, 1}, {1, 3}, {5, 1}, {6, 1}} // false
// {{5}, {5}, {5}, {6, 5}} // true
// {{5}, {5}, {5}, {6, 5}} // false
