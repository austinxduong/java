package ArrayList;

import java.util.ArrayList;
// import java.util.Arrays;

public class CMSStringPattern {
    public static ArrayList<String> cmsStringPattern(String[] cms, String pat) {

        ArrayList<String> cmsArrayList = new ArrayList<String>();
        String[] cmsArray = new String[cms.length];
        // String[] cmsArrayString = new String[cmsArray.length];
        Integer index = 0;

        for (Integer i = 0; i < cms.length; i++) {
            if (cms[i].contains(pat))
            cmsArray[index++] = cms[i];
        } // [Drupal, null, null, null]

        for (Integer a = 0; a  < cmsArray.length; a++) {
            if (cmsArray[a] != null) {
                cmsArrayList.add(cmsArray[a]);
            } // [Drupal]
        }
        return cmsArrayList; 
    }

    public static void main(String[] args) {
        String[] cms = {"WordPress", "Joomla", "Drupal", "Magento"};
        String pat = "ru";

        System.out.println(cmsStringPattern(cms, pat));
    }
}

// {"WordPress", "Joomla", "Drupal", "Magento"}, "ru" // Drupal