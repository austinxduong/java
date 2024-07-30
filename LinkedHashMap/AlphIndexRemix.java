package LinkedHashMap;
// import java.util.HashMap;
import java.util.LinkedHashMap;
// import java.util.Collections;
// import java.util.ArrayList;
// import java.util.Map;
// import java.util.Arrays;

public class AlphIndexRemix {

public static LinkedHashMap<String, Integer> alphIndex(String str, Integer[] arr) {

    
    // String arrayInteger = "";
    // String alphP = ""; 

    String[] alphArray = str.split("");

    LinkedHashMap<String, Integer> mapAlph = new LinkedHashMap<String, Integer>();
 
    
    Integer incr = 0;

    for (String ea : alphArray) {
        mapAlph.put(ea, incr);
        incr++;
        
    }

    // for (String e : arr) {
        
    // }

    // for (Integer d : arr) {
    //     for (Map.Entry<String, Integer> entry : mapAlph.entrySet()) {
    //         if (entry.getValue().equals(d)) {
            
    //         alphP += entry.getKey();
    //         }
    //     }
    // }
    return mapAlph;
}


// renders 8 elements, but outputs all keys of the alphabet, rather than the specific key to its corresponding index value hmmm...
// actual output: adbfcghe
// expected output: cmourpte

    // for (Integer d : arr) {
    //     for (Map.Entry<String, Integer> entry : mapAlph.entrySet()) {
    //         if (entry.getValue() == d);
                
    //         alphP += entry.getKey();
    //         }
    //     }
    //     return alphP;
    // }
          

    // for (Integer d : arr) {
    //     for (Map.Entry<String, Integer> entry : mapAlph.entrySet()) {
    //         if (entry.getValue() == d);
    //         alphP += entry.getKey();
    //         }
    //     }
 

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

    System.out.println(alphIndex(str, arr));
    }
}

// linkedhash maps sorts a hashmap
//computer // {c=0, o=1, m=2, p=3, u=4, t=5, e=6, r=7}