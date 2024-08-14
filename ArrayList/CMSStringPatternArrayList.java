package ArrayList;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.Arrays;

public class CMSStringPatternArrayList {
    public static String[] cmsStringPattern(String[] cms, String pat) {
        ArrayList<String> cmsArrayList = new ArrayList<String>();

        for (Integer i = 0; i < cms.length; i++) {
            
            Pattern patt = Pattern.compile(pat);
            Pattern pattt = Pattern.compile("\\w");
            Matcher matcher = patt.matcher(cms[i]);
            Matcher matcherr = pattt.matcher(cms[i]);

            if (matcher.find() && matcherr.find()) {
                cmsArrayList.add(cms[i]);
            }
        } 
        String[] cmsArrayString = new String[cmsArrayList.size()];
     
        for (Integer i = 0; i < cmsArrayList.size(); i++) {
            cmsArrayString[i] = cmsArrayList.get(i);
        }

        return cmsArrayString;
    }

    public static void main(String[] args) {
        String[] cms = {"WordPress", "Joomla", "Drupal", "Magento"};
        String pat = "dru";

        System.out.println(Arrays.toString(cmsStringPattern(cms, pat)));
    }
}

// {"WordPress", "Joomla", "Drupal", "Magento"}, "ru" // [Drupal]
// {"WordPress", "Joomla", "Drupal", "Magento"} // "dru" // []
// {"WordPress", "Joomla", "Drupal", "Magento"}, "w" // []
// {"WordPress", "Joomla", "Drupal", "Magento"}, "W" // [WordPress]
// {"WordPress", "Joomla", "Drupal", "Magento"}, "d" // [WordPress]
// {"WordPress", "Joomla", "Drupal", "Magento"}, "D" // [Drupal]
// {"WordPress", "Joomla", "Drupal", "Magento"}, "j" // []
// {"WordPress", "Joomla", "Drupal", "Magento"}, "J" // [Joomla]
// {"WordPress", "Joomla", "Drupal", "Magento"}, "m" // [Joomla]
// {"WordPress", "Joomla", "Drupal", "Magento"}, "oo" // [Joomla]
// {"WordPress", "Joomla", "Drupal", "Magento"}, "p" // [Drupal]
// {"WordPress", "Joomla", "Drupal", "Magento"}, "P" [WordPress]
// {"WordPress", "Joomla", "Drupal", "Magento"}, "" // {"WordPress", "Joomla", "Drupal", "Magento"}


