package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneNumberValidation {
    public static boolean phone(String phonenumber) {
        Pattern pat = Pattern.compile("^\\(\\d+{3}\\)$\\s\\d+{3}[-]\\d+{4}$");
        Matcher matcher = pat.matcher(phonenumber);

        if (matcher.find()) {
            return true;
        } else {
            return false;
        }
        
    }

public static void main(String[] args) {
    String phonenumber = "(365) 888-01010";
    System.out.println(phone(phonenumber));
    }
}

// (365) 888-01010 // true
// 36588801010 // false
// 365-888-01010 // false
// 365.888.01010 // false
// (365)88801010 // false
// (365)888-01010 // false
// (3650) 888-01010 // false
// (3650xyz) 888-01010 // false
// xyz(365) 888-01010 // false
// (365) 888-xyz // false
// (365) xyz-01010 // false