import java.util.Arrays;
import java.util.ArrayList;

public class IntegerObj {
    public static ArrayList<Object> integerObj(Object[] arr) {
        ArrayList<Object> objArrayList = new ArrayList<Object>();   

        Integer intLength = 0;
        Object[] integerObjArray = new Object[arr.length - intLength]; // 5 - 2
        // Object[] integerObjArray2 = new Object[arr.length - intLength];
    
        for (Object intInc : arr) {
            if (intInc instanceof Integer) {
                intLength++;
                // output: 2
            }
        }
           
        for (Integer i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Integer) {
                integerObjArray[i] = arr[i];
                }
            }

        for (Integer i = 0; i < integerObjArray.length; i++) {
            if (integerObjArray[i] != null) {
                objArrayList.add(integerObjArray[i]);
                // {"hello", 81, "basketball", 1234, "fox"} 
                // [81, 1234]
                }
            }
        


        return objArrayList;
        //[null, 81, null, 1234, null]
        // integer vaules are added to the object array, however null values are still added
    }

    public static void main(String[] args) {
        Object[] arr = {"hello", 81, "basketball", 1234, "fox"};
        System.out.println(integerObj(arr));
    }
}

