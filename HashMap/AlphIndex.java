package HashMap;
import java.util.HashMap;

public class AlphIndex {

public static HashMap<String, Integer> alphIndex(String str) {
    String alph = "abdcefghijklmnopqrstuvwxyz";

    String[] alphArray = alph.split("");

    HashMap<String, Integer> mapAlph = new HashMap<String, Integer>();
    Integer incr = 0;

    for (String ea : alphArray) {
        mapAlph.put(ea, incr);
        incr++;
        }   

    return mapAlph;
    }

public static void main(String[] args) {
    String str = "axyz";
    System.out.println(alphIndex(str));

    }
}

// {a=0, b=1, c=3, d=2, e=4, f=5, g=6, h=7, i=8, j=9, k=10, l=11, m=12, n=13, o=14, p=15, q=16, r=17, s=18, t=19, u=20, v=21, w=22, x=23, y=24, z=25}
