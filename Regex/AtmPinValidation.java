package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class AtmPinValidation {
    public static boolean ATMPin(String s) {
        Pattern pat = Pattern.compile("^[0-9]{4}$|^[0-9]{6}$");
        Matcher matcher = pat.matcher(s);

        if (!matcher.find()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "";
        System.out.println(ATMPin(s));
    }
}

// ^$12345 // false
// 1234" // true
// ^^^^^ // false
// 123456 // true
// "" // false