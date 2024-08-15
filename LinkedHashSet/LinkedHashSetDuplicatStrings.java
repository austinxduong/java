package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Arrays;

public class LinkedHashSetDuplicatStrings {
    public static String[] linkedHashSetDuplicate (String[] strInteger) {
        LinkedHashSet<String> linkedHashSetString = new LinkedHashSet<String>();

        for (Integer i = 0; i < strInteger.length; i++) {
                linkedHashSetString.add(strInteger[i]);
        }

        String[] stringArray = new String[linkedHashSetString.size()];
        Integer index = 0;

        for (String e : linkedHashSetString) {
            stringArray[index++] = e;
        }
        return stringArray;
    }

    public static void main(String[] args) {

        String[] strInteger = {"javascript", "python", "python", "ruby", "javascript", "c", "ruby"};

        System.out.println(Arrays.toString(linkedHashSetDuplicate(strInteger)));
    }
}


// {"javascript", "python", "python", "ruby", "javascript", "c", "ruby"} // [javascript, python, ruby, c]