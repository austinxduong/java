package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class VariableNames {
    public static boolean variable(String s) {
        Pattern pat = Pattern.compile("^([a-z]\\S+)$");
        Matcher matcher = pat.matcher(s);

        if(matcher.find()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "";
        System.out.println(variable(s));
    }
}

// 3M_array // false
// array_variable // true
// variable mitchmitch? // false
// variable_mitchmitch?// true

