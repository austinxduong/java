package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CMSStringPatternArrayListv1 {
    public static String[] cmsStringPatternArrayListv1(String[] cms, String pat) {
        ArrayList<String> cmsArrayList = new ArrayList<String>();

        for (Integer i = 0; i < cms.length; i++) {
            if (cms[i].toLowerCase().contains(pat)) {
                cmsArrayList.add(cms[i]);
            }
        }

        String[] cmsArrayString = cmsArrayList.toArray(new String[cmsArrayList.size()]);
        //[WordPress, Drupal]

        Arrays.sort(cmsArrayString);
        //[Drupal, WordPress]

        return cmsArrayString;
    }

    public static void main(String[] args) {
        String[] cms = {"WordPress", "Joomla", "Drupal", "Magento"};
        String pat = "d";

        System.out.println(Arrays.toString(cmsStringPatternArrayListv1(cms, pat)));
    }
}

// new branch pull

