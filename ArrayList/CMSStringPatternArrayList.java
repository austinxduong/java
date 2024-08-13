package ArrayList;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.Arrays;

public class CMSStringPatternArrayList {
    public static String[] cmsStringPattern(String[] cms, String pat) {
        // ArrayList<String> cmsArrayList = new ArrayList<String>();
        // Integer index = 0;

        ArrayList<String> cmsArrayList = new ArrayList<String>();
        // String[] cmsArray = new String[cmsArrayList.size()];

        for (Integer i = 0; i < cms.length; i++) {
            
            Pattern patt = Pattern.compile((pat), Pattern.CASE_INSENSITIVE);
            Matcher matcher = patt.matcher(cms[i]);


            if (matcher.find()) {
                cmsArrayList.add(cms[i]);
            }
        } // [Drupal, null, null, null]
        

        // for (Integer a = 0; a  < cmsArray.length; a++) {
        //     if (cmsArray[a] != null) {
        //         cmsArrayList.add(cmsArray[a]);
        //     } // [Drupal]
        // }

        String[] cmsArrayString = new String[cmsArrayList.size()];
        // Integer indx = 0;

        for (Integer i = 0; i < cmsArrayList.size(); i++) {
            cmsArrayString[i] = cmsArrayList.get(i);
        }
        // return cmsArrayString; 
        return cmsArrayString;
    }

    public static void main(String[] args) {
        String[] cms = {"WordPress", "Joomla", "Drupal", "Magento"};
        String pat = "ru";

        System.out.println(Arrays.toString(cmsStringPattern(cms, pat)));
    }
}

// {"WordPress", "Joomla", "Drupal", "Magento"}, "ru" // Drupal
