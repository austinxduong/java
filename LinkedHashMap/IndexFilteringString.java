package LinkedHashMap;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class IndexFilteringString {
    public static String[] indexFilteringString(String words, int[] indexes) {
        LinkedHashMap<String, Integer> linkedHashMapWords = new LinkedHashMap<String, Integer>();

        String[] wordsJoin = words.split(" ");

        for (int i = 0; i < wordsJoin.length; i++) {

        }
        return wordsJoin; // [Mountains, of, ice, cream, and, cookies]
    }

    public static void main(String[] args) {
        String words = "Mountains of ice cream and cookies";
        int[] indexes = {9, 12, 16, 18, 25, -2};
        System.out.println(Arrays.toString(indexFilteringString(words, indexes)));
    }
     
}

// sfecne

