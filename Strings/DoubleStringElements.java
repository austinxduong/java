package Strings;

public class DoubleStringElements {
    public static String doubleStr(String s) {
        String repeated = "";
        for(int index = 0; index < s.length(); index++) {
            repeated += s.substring(index, index + 1) + s.substring(index, index + 1);
        }
        return repeated;
    }

    public static void main(String[] args) {
        String s = "Summer time fun";
        System.out.println(doubleStr(s));
    }
}
