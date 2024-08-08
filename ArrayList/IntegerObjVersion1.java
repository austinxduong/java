package ArrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class IntegerObjVersion1 {
    public static int[] integerObj(Object[] arr) {
        ArrayList<Object> objArrayList = new ArrayList<Object>();   

        int[] integerObjArray = new int[arr.length];
      
        for (Integer i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Integer) {
                integerObjArray[i] = (Integer) arr[i];
                // if value is not type Integer, 0 values will still be appended to the array
                // {"0", 81, "0", 1234, "0"}
                }
            }

        for (Integer i = 0; i < integerObjArray.length; i++) {
            if (integerObjArray[i] != 0 ) {
                objArrayList.add(integerObjArray[i]);
                // [0, 81, 0, 1234, 0] // extract 0 values
                // objArrayList = [81, 1234]
                }
            }
            int[] objArray = new int[objArrayList.size()];
            Integer index = 0;

            if (objArrayList.size() == integerObjArray.length) {
                return integerObjArray;

                } else {
                    for (Object e : objArrayList) {
                        objArray[index] = (Integer) e;
                        index++;
                }
        return objArray;
        }
    }

    public static void main(String[] args) {
        Object[] arr = {"hello", 81, "basketball", 1234, "spaghetti", 18, 21, "alchemy", "magic", "fox", 15, 16, "sauce"};
        System.out.println(Arrays.toString(integerObj(arr)));
    }
}

// {"hello", 81, "basketball", 1234, "fox"} // [81, 1234]
// {"hello", 81, "basketball", 1234, "spaghetti", 18, 21, "alchemy", "magic", "fox", 15, 16, "sauce"} // [81, 1234, 18, 21, 15, 16] 