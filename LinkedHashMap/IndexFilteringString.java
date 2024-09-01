package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.ArrayList;

public class IndexFilteringString {
    // public static LinkedHashMap<String, ArrayList<Integer>> indexFilteringString(String words, int[] indexes) {
        public static ArrayList<String> indexFilteringString(String words, int[] indexes) {
        
        ArrayList<String> arrayListString = new ArrayList<String>();

        LinkedHashMap<String, ArrayList<Integer>> linkedHashMap = new LinkedHashMap<String, ArrayList<Integer>>();

        String[] wordsSplit = words.split("");


        for (int e = 0; e < wordsSplit.length; e++) {
            arrayListString.add(wordsSplit[e]);
        }

        // Integer incr = 0;
        // for (int i = 0; i < wordsSplit.length; i++) {
        //         linkedHashMap.put(wordsSplit[i], incr++);
        //         incr++;
        //     }

        
        return arrayListString ; // [M, o, u, n, t, a, i, n, s,  , o, f,  , i, c, e,  , c, r, e, a, m,  , a, n, d,  , c, o, o, k, i, e, s]
    }

    public static void main(String[] args) {
        String words = "Mountains of ice cream and cookies";
        int[] indexes = {9, 12, 16, 18, 25, -2};
        System.out.println(indexFilteringString(words, indexes));
    }
     
}

// sfecne

