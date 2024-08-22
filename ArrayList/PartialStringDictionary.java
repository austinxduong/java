package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class PartialStringDictionary {
    public static String[] partionalStringDictionary(String[] stringArray, String word) {

        ArrayList<String> stringArrayList = new ArrayList<String>();


        for (Integer i = 0; i < stringArray.length; i++) {
            if (stringArray[i].startsWith(word)) {
                stringArrayList.add(stringArray[i]);
            }
        }

        String[] partionalString = stringArrayList.toArray(new String[stringArrayList.size()]);
  
        return partionalString;
    }
    public static void main(String[] args) {
        String[] stringArray = {"creating", "creature", "creed", "increasing"};
        String word = "cre";

        System.out.println(Arrays.toString(partionalStringDictionary(stringArray, word)));
    }
}
