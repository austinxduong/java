package Strings;

public class StringReverse {
    public static String reverse(final String str) {
        char[] arrayStr = str.toCharArray();
        String strWord = "";

        for (int a = arrayStr.length - 1; a >= 0; a--) {
            strWord += arrayStr[a];
        }
        return strWord;
    }

    public static void main(String[] args) {
        String str = "Apple";
        System.out.println(reverse(str));
    }
}
