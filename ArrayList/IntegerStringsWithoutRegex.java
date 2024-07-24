package ArrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class IntegerStringsWithoutRegex {
    public static String[] integerStringsWithoutRegex(String[] array) {
        ArrayList<String> arrayList = new ArrayList<String>();

        for (Integer d = 0; d < array.length; d++) {
            for (Integer p = 0; p < array[d].length(); p++) {
                if (Character.isDigit(array[d].charAt(p))) {
                    arrayList.add(array[d]);
                    break;
                }
            }
        }

        return arrayList.toArray(new String[arrayList.size()]); 
 
    }
    
    public static void main(String[] args) {
        String[] array = {"dd", "p3p", "c0c"};
        System.out.println(Arrays.toString(integerStringsWithoutRegex(array)));
    }
    
}

// [p3p, c0c];