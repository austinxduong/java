package HashMap;

import java.util.HashMap;


public class MapAlphabet {
    public static HashMap<String, String> mapping(String[] alph) {
        HashMap<String, String> mapAlph = new HashMap<String, String>();

        for (String e : alph) {
            if (mapAlph.containsKey(e)) {
                mapAlph.put(e, mapAlph.get(e));
            } else {
                mapAlph.put(e, e.toUpperCase());
            }
        }
        // for (Map.Entry<String, String> entry : mapAlph.entrySet()) {
        //     System.out.println(entry.getKey() + ":");
        // }
        return mapAlph;
    }

    public static void main(String[] args) {
        String[] alph = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        System.out.println(mapping(alph));
    }
}

// {a=A, b=B, c=C, d=D, e=E, f=F, g=G, h=H, i=I, j=J, k=K, l=L, m=M, n=N, o=O, p=P, q=Q, r=R, s=S, t=T, u=U, v=V, w=W, x=X, y=Y, z=Z}