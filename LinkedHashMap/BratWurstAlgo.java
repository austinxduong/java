package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class BratWurstAlgo {
    public static String bratWurstAlgo(String sentence) {
        String sausage = "Wurst";
        String[] sentenceSplit = sentence.split(" ");

        TreeMap<String, String> linkedHashMapSausage = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);

        linkedHashMapSausage.put("Sausage", "Sausage");
        linkedHashMapSausage.put("Kielbasa", "Kielbasa");
        linkedHashMapSausage.put("Chorizo", "Chorizo");
        linkedHashMapSausage.put("Moronga", "Moronga");
        linkedHashMapSausage.put("Salami", "Salami");
        linkedHashMapSausage.put("Andouille", "Andouille");
        linkedHashMapSausage.put("Naem", "Naem");
        linkedHashMapSausage.put("Merguez", "Merguez");
        linkedHashMapSausage.put("Gurka","Gurka");
        linkedHashMapSausage.put("Snorkers", "Snorkers");
        linkedHashMapSausage.put("Pepperoni", "Pepperoni");

        // (sentenceSplit[i].contains(sausage))

        String words = "";

        for(int i = 0; i < sentenceSplit.length; i++) {
            for (Map.Entry<String, String> entry : linkedHashMapSausage.entrySet()) {
                if (entry.getKey().equals(sentenceSplit[i])) {
                // if (entry.getKey().equals(sentenceSplit[i]) || entry.getValue().equals(sentenceSplit[i])) {
                    words = sentence.replace(sentenceSplit[i], "Wurst");
                }
            }

        }
        return words; // Add the Wurst with the pepperoni and the reserved potatoes and stir through
    }
    
    public static void main(String[] args) {
        String sentence = "Add the Kielbasa with the pepperoni and the reserved potatoes and stir through";
        System.out.println(bratWurstAlgo(sentence));
    }
}

// Add the Wurst and the reserved potatoes and stir through