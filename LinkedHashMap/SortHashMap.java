package LinkedHashMap;

import java.util.LinkedHashMap;

public class SortHashMap {
    public static LinkedHashMap<String, Integer> sortHashMap(String str, Integer[] arr) {
        String[] alphArray = str.split("");

        LinkedHashMap<String, Integer> mapAlph = new LinkedHashMap<String, Integer>();

        Integer incr = 0;

        for (String ea : alphArray) {
            mapAlph.put(ea, incr);
            incr++;
        }

        return mapAlph;
    }

    public static void main(String[] args) {
        String str = "computer";
        Integer[] arr = {0, 2, 1, 5, 3, 6, 7, 4};

        System.out.println(sortHashMap(str, arr));
    }
}
