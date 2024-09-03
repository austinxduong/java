package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class IndexFilteringString {
    public static char[] indexFilteringString(String words, int[] indexes) {
        String[] wordsSplit = words.split("");
        int[] integerArray = new int[wordsSplit.length];

        int incr = 0;
        String str = "";
        char[] charArray = new char[40];
        char[] charArrayString = words.toCharArray();
        String[] stringArray = new String[40];
        
        

        // for (int i = 0; i < words.length(); i++) {
            // for (int a = 0; a < indexes.length; a++) {
                // if (words.indexOf(i) == ) {
                    // charArray[i] += words.charAt(i);
                    // incr += indexes[a];
                
                
            // }




            

            for (int i = 0; i < charArrayString.length; i++) {
                // for (int a = 0; a < indexes.length; a++) {

                    // int found = new String(charArrayString).indexOf(indexes[a]);
                    
                    if (charArrayString[i] == 'a') {
                        charArray[i] += charArrayString[i];
       
                    }
                // }
                // charArrayString[i] += words.charAt(i); 
                // Mountains of ice cream and cookies
            }

            // for (int i = 0; i < charArrayString.length; i++) {
            //     str += words.charAt(i); 
            //     // Mountains of ice cream and cookies
            // }
        

        

        // for (int i = 0; i < wordsSplit.length; i++) {
        //     integerArray[i] += words.indexOf(wordsSplit[i]);
        //     // [0, 1, 2, 3, 4, 5, 6, 3, 8, 9, 1, 11, 9, 6, 14, 15, 9, 14, 18, 15, 5, 21, 9, 5, 3, 25, 9, 14, 1, 1, 30, 6, 15, 8]
        // }
        return charArray; 
    
    }



    public static void main(String[] args) {
        String words = "Mountains of ice cream and cookies"; // 34 letters
        int[] indexes = {9, 12, 16, 18, 25, -2};
        System.out.println(Arrays.toString(indexFilteringString(words, indexes)));
        // System.out.println(indexFilteringString(words, indexes));

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