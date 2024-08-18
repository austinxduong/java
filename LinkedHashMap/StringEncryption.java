package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringEncryption {
    public static String stringEncryption(String word) {

        LinkedHashMap<String, String> linkedHashMapEncryption = new LinkedHashMap<String, String>();
        char[] arrayStr = word.toCharArray();        
        String wrd = "aca"; 

        linkedHashMapEncryption.put("a", "0");
        linkedHashMapEncryption.put("e", "1");
        linkedHashMapEncryption.put("i", "2");
        linkedHashMapEncryption.put("o", "2");
        linkedHashMapEncryption.put("u", "3");

        String reversedString = ""; // elppa
        
        for (Integer i = arrayStr.length - 1; i >= 0; i--) {
            reversedString += arrayStr[i];
        }

        String[] revStrArray = reversedString.split(""); // [e, l, p, p, a]

            
            for (Integer d = 0; d < revStrArray.length; d++) {
                for (Map.Entry<String, String> entry : linkedHashMapEncryption.entrySet()) {
                    if (entry.getKey().equals(revStrArray[d])) {
                        
                        revStrArray[d] = entry.getValue(); // [1, l, p, p, 0]
                    }
                }
            }
            String wordArray = String.join("", revStrArray);
            String wordArrayJoin = wordArray.concat(wrd);

        // }
        return wordArrayJoin; 
        // 1lpp0aca
        // expected output: 1lpp0aca
    }   
    public static void main(String[] args) {
        String word = "apple";
        System.out.println(stringEncryption(word));
    }
}

// "apple" // 1lpp0aca