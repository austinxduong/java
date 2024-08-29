package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Arrays;


public class OmnipresentIntegerV0 {
    public static int omnipresentInteger(int[][] array, int integerr) {

        ArrayList<LinkedHashSet<Integer>> integerArrayList = new ArrayList<LinkedHashSet<Integer>>();
        ArrayList<Integer[]> arrayListYay = new ArrayList<Integer[]>();
        int[][] arrayInteger = new int[integerArrayList.size()][];
        Integer[] sArrayInteger = new Integer[13];


        for (int i = 0; i < array.length; i++) {

            LinkedHashSet<Integer> subArray = new LinkedHashSet<Integer>();

            for (int a = 0; a < array[i].length; a++) {
                
                    subArray.add(array[i][a]);
                   
                }
                integerArrayList.add(subArray);

                Integer[] subArrayInteger = subArray.toArray(new Integer[0]);
                // Integer[] sArrayInteger = new Integer[10];

               arrayListYay.add(sArrayInteger);
                for (int r = 0; r < subArrayInteger.length; r++) {
                    sArrayInteger[i] = subArrayInteger[r];
                }
            }

            int increment = 0;
            for (int g = 0; g < arrayListYay.size(); g++) {
                for (int w = 0; w < arrayListYay.get(g).length; w++) {
                    if (arrayListYay.get(g)[w] == integerr) {
                        increment++;
                }
                

                }
            }
        //     for (int r = 0; r < subArrayInteger.length; r++) {
        //         sArrayInteger[i] = subArrayInteger[r];
        //     }
        // }
        return increment;
    }
                // for (int d = 0; d < integerArrayList.size(); d++) {
                //  for (int e = 0; e < integerArrayList.size(); e++) {
                //     integerArrayList.get(d).get(e);
                //     }
                // }
            

        
        // int[][] arrayInteger = new int[integerArrayList.size()][];

        // for (int d = 0; d < integerArrayList.size(); d++) {
        //     subArray.toArray();
        //     arrayInteger[i] = 
        //     }
            
    //     int arraySize = array.length; // 6

    //     if (integerArrayList.size() < arraySize) {
    //         return false;
    //     }
    // }

// ArrayList<Integer> arrayList = new ArrayList<Integer>();

// }
//         int[][] arrayInteger = new int[integerArrayList.size()][];


//         for (int d = 0; d < integerArrayList.size(); d++) {
//             arrayInteger[i] = integerArrayList.get(d);
//         }


        
        // return true; // [3, 3, 3, 3, 3, 3]
        ;
//         }
// }



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
