import java.util.ArrayList;



public class OmnipresentInteger {
    public static ArrayList<Integer> omnipresentInteger(int[][] array, int integerr) {

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array[i].length; a++) {
                if (array[i][a] == integerr) {
                    integerArrayList.add(array[i][a]);
                }
            }
        }
        return integerArrayList; // [3, 3, 3, 3, 3, 3]
    }


    public static void main(String[] args) {
        int[][] array = {{3, 4}, {8, 3, 2}, {3}, {9, 3}, {5, 3}, {4, 3}};
        int integerr = 3;
        System.out.println(omnipresentInteger(array, integerr));
    }
}

// ArrayList<ArrayList<Integer>> arrayListInteger = new ArrayList<ArrayList<Integer>>();

// for (int i = 0; i < array.length; i++) {
//     ArrayList<Integer> subArrays = new ArrayList<Integer>();

//     for (int a = 0; a < array[i].length; a++) {
//         subArrays.add(array[i][a]);
//     }
//     arrayListInteger.add(subArrays);
// }

// ArrayList<Integer> arrayList = new ArrayList<Integer>();

// for (int i = 0; i < arrayListInteger.size(); i++) {
// for (int a = 0; a < arrayListInteger.get(i).size(); a++) {

    

//     // arrayList.add(arrayListInteger[i][a]);
//     }
// return arrayList; // [[3, 4], [8, 3, 2], [3], [9, 3], [5, 3], [4, 3]] // multidimensional array

//  }
// }