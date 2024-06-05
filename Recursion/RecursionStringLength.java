package Recursion;

public class RecursionStringLength {
    public static int StringLength(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            return StringLength(str.substring(1)) + 1;
        }
    }
}
