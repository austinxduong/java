package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneNumberRegex {
    public static String phone(String phonenumber) {
        Pattern pat = Pattern.compile("\\(\\d+{3}\\)\\s\\d+{3}[-]\\d+{4}");
        Matcher matcher = pat.matcher(phonenumber);

        if (matcher.find()) {
            return matcher.group();
        } else {
            return matcher.group();
        }
    }

public static void main(String[] args) {
    String phonenumber = "(365) 888-01010";
    System.out.println(phone(phonenumber));
    }
}

// (365) 888-01010