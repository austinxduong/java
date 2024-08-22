import java.util.ArrayList;


public class OmnipresentInteger {
    public static ArrayList<Integer> omnipresentInteger(int[][] array, int integerr) {
        ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();


        for (Integer i = 0; i < array.length; i++) {
            for (Integer a = 0; a < array[i].length; a++) {
                 
                arrayListInteger.add(array[i][a]);
                
            }
        }
        return arrayListInteger; // [3, 4, 8, 3, 2, 3, 9, 3, 5, 3, 4, 3]
    }

    public static void main(String[] args) {
        int[][] array = {{3, 4}, {8, 3, 2}, {3}, {9, 3}, {5, 3}, {4, 3}};
        int integerr = 3;
        System.out.println(omnipresentInteger(array, integerr));
    }
}
