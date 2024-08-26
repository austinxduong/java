package ArrayList;

import java.util.ArrayList;


public class OmnipresentIntegerV0 {
    public static boolean omnipresentInteger(int[][] array, int integerr) {

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {

            for (int a = 0; a < array[i].length; a++) {
                if (array[i][a] == integerr) {
                    
                    integerArrayList.add(array[i][a]);
                   
                }
            }
        }
        int arraySize = array.length; // 6

        if (integerArrayList.size() < arraySize) {
            return false;
        }
        
        return true; // [3, 3, 3, 3, 3, 3]
      
    }


    public static void main(String[] args) {
        int[][] array = {{3, 4}, {8, 3, 2}, {}, {9, 3}, {5, 3}, {4, 3}};
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
