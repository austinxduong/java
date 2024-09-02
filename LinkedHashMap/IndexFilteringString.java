package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class IndexFilteringString {
    public static int[] indexFilteringString(String words, int[] indexes) {
        String[] wordsSplit = words.split("");
        int[] integerArray = new int[wordsSplit.length];

        for (int i = 0; i < wordsSplit.length; i++) {
            integerArray[i] += words.indexOf(wordsSplit[i]);
        }
        return integerArray;
        
    }



    public static void main(String[] args) {
        String words = "Mountains of ice cream and cookies";
        int[] indexes = {9, 12, 16, 18, 25, -2};
        System.out.println(Arrays.toString(indexFilteringString(words, indexes)));
    }
     
}

// sfecne



    // // public static LinkedHashMap<String, ArrayList<Integer>> indexFilteringString(String words, int[] indexes) {
    //     // public static ArrayList<String> indexFilteringString(String words, int[] indexes) {
    //         public static LinkedHashMap<String, ArrayList<Integer>> indexFilteringString(String words, int[] indexes) {
        
    //             ArrayList<String> arrayListString = new ArrayList<String>();
    //             ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
        
    //             // LinkedHashMap<String, ArrayList<String>> linkedHashMap = new LinkedHashMap<String, ArrayList<String>>();
    //             LinkedHashMap<String, ArrayList<Integer>> linkedHashMap = new LinkedHashMap<String, ArrayList<Integer>>();
        
        
    //             String[] wordsSplit = words.split("");
        
        
    //             for (int e = 0; e < wordsSplit.length; e++) {
    //                 arrayListString.add(wordsSplit[e]);
    //             }
        
    //             for (int a = 0; a < arrayListString.size(); a++) {
    //                 linkedHashMap.put(arrayListString.get(a), arrayListInteger);
    //             }
                    
    //             int incr = 0;
    //             for (int e = 0; e < wordsSplit.length; e++) {
    //                 arrayListInteger.add(incr++);
        
    //             }
        
    //             // for (int a = 0; a < arrayListString.size(); a++) {
    //             //     linkedHashMap.put(arrayListString.get(a), arrayListString);
    //             // }
        
        
        
    //             // Integer incr = 0;
    //             // for (int i = 0; i < wordsSplit.length; i++) {
    //             //         linkedHashMap.put(wordsSplit[i], incr++);
    //             //         incr++;
    //             //     }
        
                
    //             return linkedHashMap; // [M, o, u, n, t, a, i, n, s,  , o, f,  , i, c, e,  , c, r, e, a, m,  , a, n, d,  , c, o, o, k, i, e, s]
    //         }