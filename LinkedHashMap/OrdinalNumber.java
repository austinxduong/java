package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Arrays;

public class OrdinalNumber {
    public static String[] ordinalNumber(int integer) {

        LinkedHashMap<Integer, String> linkedHashMap = new  LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, "ST");
        linkedHashMap.put(2, "ND");
        linkedHashMap.put(3, "RD");
        linkedHashMap.put(4, "TH");
        linkedHashMap.put(5, "TH");
        linkedHashMap.put(6, "TH");
        linkedHashMap.put(7, "TH");
        linkedHashMap.put(8, "TH");
        linkedHashMap.put(9, "TH");
        linkedHashMap.put(10, "TH");
        linkedHashMap.put(11, "TH");
        linkedHashMap.put(12,"TH");
        linkedHashMap.put(13, "TH");
        linkedHashMap.put(14, "TH");
        linkedHashMap.put(15, "TH");
        linkedHashMap.put(16, "TH");
        linkedHashMap.put(17, "TH");
        linkedHashMap.put(18, "TH");
        linkedHashMap.put(19, "TH");
        
        
        String[] sInteger = String.valueOf(integer).split(""); // [5, 5, 3]
        String sIntegerD = String.valueOf(integer) + "-";

        return sInteger; // "553-"
        
    }

    public static void main(String[] args) {
        int integer = 553;
        System.out.println(ordinalNumber(integer));
        System.out.println(Arrays.toString(ordinalNumber(integer)));
    }
}
