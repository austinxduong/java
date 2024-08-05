import java.util.Arrays;

public class IntegerObj {
    public static Object[] integerObj(Object[] arr) {
        Integer intLength = 0;
        Object[] integerObjArray = new Object[arr.length - intLength]; // 5 - 2
    
        for (Object intInc : arr) {
            if (intInc instanceof Integer) {
                intLength++;
                // output: 2
            }
           
        for (Integer i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Integer) {
                integerObjArray[i] = arr[i];
                }
            }
        }
        return integerObjArray;
        //[null, 81, null, 1234, null]
        // integer vaules are added to the object array, however null values are still added
    }

    public static void main(String[] args) {
        Object[] arr = {"hello", 81, "basketball", 1234, "fox"};
        System.out.println(Arrays.toString(integerObj(arr)));
    }
}
