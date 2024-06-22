package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ZipCodeValidation {
    public static boolean ZipCodeRegex(String zipcode) {
        Pattern pat = Pattern.compile("^\\d{0,5}$");
        Matcher matcher = pat.matcher(zipcode);

        if(matcher.find()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String zipcode = "25a19";
;        System.out.println(ZipCodeRegex(zipcode));
    }
}

// 123456 // false
// 12345 // true
// 25 19 // false
// 25a19 // false