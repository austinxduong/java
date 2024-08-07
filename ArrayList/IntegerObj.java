package ArrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class IntegerObj {
    public static Object[] integerObj(Object[] arr) {
        ArrayList<Object> objArrayList = new ArrayList<Object>();   

        Object[] integerObjArray = new Object[arr.length];
      
        for (Integer i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Integer) {
                integerObjArray[i] = arr[i];
                // if value is not type Integer, null values will still be appended to the array
                // {"null", 81, "null", 1234, "null"}
                }
            }

        for (Integer i = 0; i < integerObjArray.length; i++) {
            if (integerObjArray[i] != null) {
                objArrayList.add(integerObjArray[i]);
                // {"null", 81, "null", 1234, "null"} // extract null values
                // objArrayList = [81, 1234]
                }
            }

            if (objArrayList.size() == integerObjArray.length) {
                return integerObjArray;

            } else {
                Object[] objArray = new Object[objArrayList.size()];
                Integer index = 0;

                for (Object e : objArrayList) {
                    objArray[index] = e;
                    index++;
            }
        return objArray;

        }
    }

    public static void main(String[] args) {
        Object[] arr = {"hello", 81, "basketball", 1234, "fox"};
        System.out.println(Arrays.toString(integerObj(arr)));
    }
}

// {"hello", 81, "basketball", 1234, "fox"} // [81, 1234]