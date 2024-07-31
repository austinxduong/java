package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class AlphIndexRemix {
    public static String alphIndex(String str, Integer[] arr) {

    
    // String arrayInteger = ""; 
    String[] alphArray = str.split("");
    String alphP = "";

    LinkedHashMap<String, Integer> mapAlph = new LinkedHashMap<String, Integer>();
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
}
  
public static void main(String[] args) {
    String str = "computer";
    Integer[] arr = {0, 2, 1, 5, 3, 6, 7, 4};
    System.out.println(alphIndex(str, arr));
    }
}

// linkedhash maps sorts a hashmap
//computer // {c=0, o=1, m=2, p=3, u=4, t=5, e=6, r=7} // cmotperu