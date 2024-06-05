package Strings;

public class StringInverseCapitalize {
    public static String strInverse(String str) {
        String capitalize = str.toUpperCase();
        String strCapitalize = "";

        for (int i = 0; i < capitalize.length(); i++) {
            char c = capitalize.charAt(i);
            strCapitalize = c + strCapitalize;
        }
        return strCapitalize;
    }
}
