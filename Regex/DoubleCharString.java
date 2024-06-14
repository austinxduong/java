package Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DoubleCharString {
    public static boolean dCharS(String word) {
        Pattern pat = Pattern.compile("(\\w)\\1+");
        Matcher matcher = pat.matcher(word);

        if (matcher.find()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String word = "weed";
        System.out.println(dCharS(word));
    }
}

// true;
