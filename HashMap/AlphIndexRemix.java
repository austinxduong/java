package HashMap;
import java.util.HashMap;
import java.util.Map;

public class AlphIndexRemix {

public static String alphIndex(String str, Integer[] arr) {
    String alph = "abdcefghijklmnopqrstuvwxyz";
    String alphP = ""; 

    String[] alphArray = alph.split("");

    HashMap<String, Integer> mapAlph = new HashMap<String, Integer>();
    Integer incr = 0;

    for (String ea : alphArray) {
        mapAlph.put(ea, incr);
        incr++;

        // for (Integer d : arr) {
        //     for (Map.Entry<String, Integer> entry : mapAlph.entrySet()) {
        //         if (entry.containsValue(d)) {
        //             alphP += entry.getKey();
        //             }
        //         }
        //     }
        }   

        for (Integer d : arr) {
            for (Map.Entry<String, Integer> entry : mapAlph.entrySet()) {
                if (entry.getValue() == d);
                alphP += entry.getKey();
                }
            }
 
    // for (Map.Entry<String, Integer> entry : mapAlph.entrySet()) {
    //     for (Integer d : arr) {
            
    //         if (entry.containsValue(d)) {
    //             alphP += entry.getKey();
    //             }
    //         }
    //         return alphP;
    //     }
    return alphP;
    }

public static void main(String[] args) {
    String str = "computer";
    Integer[] arr = {0, 2, 1, 5, 3, 6, 7, 4};

    System.out.println(alphIndex(str, arr));
    }
}

// renders 8 elements, but outputs all keys of the alphabet, rather than the specific key to its corresponding index value hmmm...