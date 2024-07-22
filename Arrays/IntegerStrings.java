package Arrays;

import java.util.Arrays;
import java.util.ArrayList;

public class IntegerStrings {
    public static String[] integerStrings(String[] array) {

        ArrayList<String> plentiful = new ArrayList<String>(); 

        for (String i : array) {
            if (i.matches(".*\\d.*")) {
                plentiful.add(i);
            }
        }

        String[] p = new String[plentiful.toArray().length];

        for (int d = 0; d < p.length; d++) {
            p[d] = (String) plentiful.get(d);
        }
        return p;
    }

    public static void main(String[] args) {

        String[] array = {"dd", "p3p", "c0c"};

        System.out.println(Arrays.toString(integerStrings(array)));
    }
}

// [p3p, c0c];