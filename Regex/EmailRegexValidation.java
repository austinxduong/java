package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailRegexValidation {
    public static boolean email(String emale) {
        Pattern pat = Pattern.compile("^(\\w+)((.*))(\\w+)@(\\w+)\\.(\\w+)$");
        Matcher matcher = pat.matcher(emale);

        if (matcher.find()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String emale = "gwhite_mail1818@hotmail.com";
        System.out.println(email(emale));
    }
}

// gwhite.mail@hotmail.com // true
// gwhite.mail1818@hotmail.com // true
// gwhite.mail_1818@hotmail.com // true
// gwhite.mail.1818@hotmail.com // true
// gwhite.mail_1818@hotmail.com // true
// gwhite_mail_1818@hotmail.com // true
// gwhite.mail@com // false
// gwhite@com // false
// ^~^`-* // false
// www.gwhite.com // false
// gwhite.mail@ // false
// gwhiteemail // false
// gwhiteemail@@hotmail.com // false
// gwhiteemail@@hotmail..com // false
// .gwhiteemail@hotmail.com // false
// gwhiteemail@hotmail.com. // false

