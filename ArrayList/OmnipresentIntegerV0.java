package ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;


public class OmnipresentIntegerV0 {
    public static boolean omnipresentInteger(int[][] array, int integerr) {

        ArrayList<LinkedHashSet<Integer>> integerArrayList = new ArrayList<LinkedHashSet<Integer>>();


        for (int i = 0; i < array.length; i++) {

            LinkedHashSet<Integer> subArray = new LinkedHashSet<Integer>();

            for (int a = 0; a < array[i].length; a++) {
                
                    subArray.add(array[i][a]);
                   
                }
                integerArrayList.add(subArray);
            }
            int increment = 0;

        for (int d = 0; d < integerArrayList.size(); d++) {
           
                if (integerArrayList.get(d).contains(integerr)) {
                    increment++;
                
            }
        }

        if (increment < integerArrayList.size()) {
            return false;
        }
            
        return true; 

    }


    public static void main(String[] args) {
        int[][] array = {{3, 4, 3, 4}, {8, 3, 2}, {}, {9, 3}, {5, 3}, {4, 3}, {3, 4}, {5, 3}};
        int integerr = 3;
        System.out.println(omnipresentInteger(array, integerr));
    }
}


// {{3, 3, 4}, {8, 3, 3, 2}, {}, {3}, {3}, {9, 3}, {5, 3}, {4, 3}}, 3 // false
// {{3, 3, 4}, {8, 3, 3, 2}, {}, {}, {}, {9, 3}, {5, 3}, {4, 3}}, 3 // false
// {{3, 3, 4}, {8, 3, 3, 2}, {3}, {3}, {3}, {9, 3}, {5, 3}, {4, 3}}, 3 // true
// {{1, 1}, {1, 3}, {5, 1}, {6, 1}} // false
// {{3, 4, 3, 4}, {8, 3, 2}, {}, {9, 3}, {5, 3}, {4, 3}, {3, 4}, {5, 3}} // false


