package HashMap;

import java.util.HashMap;
import java.util.Map;

  

public class AlphIndexKey {
public static String alphIndexKey(String str, Integer[] arr) {

    String alph = "abdcefghijklmnopqrstuvwxyz";
    String alphP = "";
    String[] alphArray = alph.split("");

    HashMap<String, Integer> mapAlph = new HashMap<String, Integer>();
    Integer incr = 0;

    for (String ea : alphArray) {
        mapAlph.put(ea, incr);
        incr++;

    }

  

    for (Integer d : arr) {
        for (Map.Entry<String, Integer> entry : mapAlph.entrySet()) {
        if (entry.getValue().equals(d)) {

        alphP += entry.getKey();
            }
        }
    }
    return alphP;
    // output: adbfcghe // prints 8 elements, with unique key, however the keys mapping to the string aren't in the corresponding order of index number. hmm...
    // expected output: cmourpte
}

  

//     for (Integer d : arr) {
//         for (Map.Entry<String, Integer> entry : mapAlph.entrySet()) {
//         (entry.getValue() == d);
//         alphP += entry.getKey();
//             }
//         }
//     return alphP;

// }

  

//     for (Map.Entry<String, Integer> entry : mapAlph.entrySet()) {
//         for (Integer d : arr) {
//         if (entry.containsValue(d)) {
//         alphP += entry.getKey();
//              }
//          }
//     return alphP;
// }

  
public static void main(String[] args) {
    String str = "computer";
    Integer[] arr = {0, 2, 1, 5, 3, 6, 7, 4};
    System.out.println(alphIndexKey(str, arr));
    }
}
