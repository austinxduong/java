package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;

public class StringEncryption {
    public static String stringEncryption(String word) {

        LinkedHashMap<String, String> linkedHashMapEncryption = new LinkedHashMap<String, String>();
        char[] arrayStr = word.toCharArray();
        
        String randomString = "abcd";
        String[] rString = randomString.split("");
        // char[] revCharStr = reversedString.toCharArray();
        
        String wrd = "aca"; 
        // String encryptString = "";
        

        linkedHashMapEncryption.put("a", "0");
        linkedHashMapEncryption.put("e", "1");
        linkedHashMapEncryption.put("i", "2");
        linkedHashMapEncryption.put("o", "2");
        linkedHashMapEncryption.put("u", "2");

        String reversedString = ""; //elppA
        

        for (Integer i = arrayStr.length - 1; i >= 0; i--) {
            reversedString += arrayStr[i];
        }

        // String[] strArray = word.split("");
        String[] revStrArray = reversedString.split(""); // [e, l, p, p, a]
        // String[] newRevStrArray = new String[revStrArray.length];
        // String wordArray = revStrArray.toString();

        // for (Integer i = 0; i < reversedString.length(); i++) {
            
            for (Integer d = 0; d < revStrArray.length; d++) {
                for (Map.Entry<String, String> entry : linkedHashMapEncryption.entrySet()) {
                    if (entry.getKey().equals(revStrArray[d])) {
                        
                        revStrArray[d] = entry.getValue(); // [a, p, p, l, 1]
                    
                        // revStrArray[d] += entry.getValue(); // [e0, l, p, p, a]
                        // revStrArray[d].replace("revStrArray[d]", entry.getValue());
                    }
                }
            }
            String wordArray = String.join("", revStrArray);

        // }
        return wordArray; // 1lpp0
        // return revStrArray; // [1, l, p, p, 0]
        // expected output: 1lpp0aca
    }   
    public static void main(String[] args) {
        String word = "apple";
        System.out.println(stringEncryption(word));
    }
}
