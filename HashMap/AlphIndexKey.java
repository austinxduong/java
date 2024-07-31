package HashMap;

import java.util.HashMap;
import java.util.Map;

  

public class AlphIndexKey {
public static String alphIndexKey(String str, Integer[] arr) {

    String alph = "abdcefghijklmnopqrstuvwxyz";
    String[] alphArray = alph.split("");
    String alphP = "";

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
}

public static void main(String[] args) {
    String str = "computer";
    Integer[] arr = {0, 2, 1, 5, 3, 6, 7, 4};
    System.out.println(alphIndexKey(str, arr));
    }
}
// hashmap // {a=0, b=1, c=3, d=2, e=4, f=5, g=6, h=7, i=8, j=9, k=10, l=11, m=12, n=13, o=14, p=15, q=16, r=17, s=18, t=19, u=20, v=21, w=22, x=23, y=24, z=25}
// {0, 2, 1, 5, 3, 6, 7, 4} // adbfcghe 
