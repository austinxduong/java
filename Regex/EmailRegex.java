package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailRegex {
   public static String email(String emale) {
    Pattern pat = Pattern.compile("^(\\w+)((.))(\\w+)@(\\w+(.))(\\w+)$");
    // ^\\(\\w+\\)\\(?=@\\)\\(\\w+\\)\\(?=.\\)$
    Matcher matcher = pat.matcher(emale);

    if (matcher.find()) {
        return matcher.group();
    } else {
        return matcher.group();
    }
   } 

   public static void main(String[] args) {
    String emale = "gwhite.mail1818@hotmail.com";

    System.out.println(email(emale));
   }
}

//^(\\w+)((.))(\\w+)(@)(\\w+(.))(\\w+)$ // gwhite.mail@hotmail.com
