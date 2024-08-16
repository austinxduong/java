package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;

public class StringEncryption {
    public static String[] stringEncryption(String word) {

        LinkedHashMap<String, String> linkedHashMapEncryption = new LinkedHashMap<String, String>();
        char[] arrayStr = word.toCharArray();
        
        String randomString = "abcd";
        String[] rString = randomString.split("");
        // char[] revCharStr = reversedString.toCharArray();
        
        // String wrd = "aca"; 
        // String encryptString = "";
        

        // linkedHashMapEncryption.put("a", "0");
        // linkedHashMapEncryption.put("e", "1");
        // linkedHashMapEncryption.put("i", "2");
        // linkedHashMapEncryption.put("o", "2");
        // linkedHashMapEncryption.put("u", "2");

        String reversedString = "";

        for (Integer i = arrayStr.length - 1; i >= 0; i--) {
            
            reversedString += arrayStr[i];
        }

        String[] revStrArray = reversedString.split(""); // [e, l, p, p, A]
        

        // for (Integer i = 0; i < reversedString.length(); i++) {
            // for (Integer i = 0; i  < revStrArray.length; i++) {
            //     for (Map.Entry<String, String> entry : linkedHashMapEncryption.entrySet()) {
            //         if (linkedHashMapEncryption.containsKey(revStrArray[i])) {
            //             reversedString.replace("reversedString[i]", entry.getValue());
            //         }
            //     }

            // }
        
        // }
        return revStrArray; // [e, l, p, p, A]
    }   
    public static void main(String[] args) {
        String word = "Apple";
        System.out.println(Arrays.toString(stringEncryption(word)));
    }
}
