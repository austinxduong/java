package Strings;

public class StringCompare {
    public static boolean strCom(String str1, String str2) {
        if (!str1.equalsIgnoreCase(str2)) {
            return false;
        } else {
            return true;
        }
    }
}
