package HashMap;

import java.util.Map;
import java.util.HashMap;

public class HashToString {
    public static String getValues(Map<String,String> dic) {
        String[] array = dic.values().toArray(new String[0]);
        String str = "";

        for (String values : array) {
            str += values;
        }
        return str;
    }

    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();
        dic.put("a", "Apple");
        dic.put("b", "MicroSoft");
        dic.put("c", "Google");
        System.out.println(getValues(dic));
    }
}

// AppleMicroSoftGoogle