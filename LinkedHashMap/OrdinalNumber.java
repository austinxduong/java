package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class OrdinalNumber {
    public static String ordinalNumber(int integer) {

        LinkedHashMap<String, String> linkedHashMap = new  LinkedHashMap<String, String>();
        linkedHashMap.put("1", "ST");
        linkedHashMap.put("2", "ND");
        linkedHashMap.put("3", "RD");
        linkedHashMap.put("4", "TH");
        linkedHashMap.put("5", "TH");
        linkedHashMap.put("6", "TH");
        linkedHashMap.put("7", "TH");
        linkedHashMap.put("8", "TH");
        linkedHashMap.put("9", "TH");
        linkedHashMap.put("10", "TH");
        linkedHashMap.put("11", "TH");
        linkedHashMap.put("12","TH");
        linkedHashMap.put("13", "TH");
        linkedHashMap.put("14", "TH");
        linkedHashMap.put("15", "TH");
        linkedHashMap.put("16", "TH");
        linkedHashMap.put("17", "TH");
        linkedHashMap.put("18", "TH");
        linkedHashMap.put("19", "TH");
        
        String sInteger = String.valueOf(integer); // "221"
        String sIntegerD = String.valueOf(integer) + "-"; // "221-""
        String subStringInteger = "";
        String linkedSubStringInteger = "";


        for (int i = 0; i < sInteger.length(); i++) {
            if (sInteger.charAt(1) == '1') {
                subStringInteger = sInteger.substring(sInteger.length() -2); // 521 // 18
            } else {
                subStringInteger = sInteger.substring(sInteger.length() -1); // 528 // 8
                }            
            }

        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            if (entry.getKey().equals(subStringInteger)) {
                linkedSubStringInteger = entry.getValue();
                    }
        }
        return sIntegerD + linkedSubStringInteger; 
        
    }

    public static void main(String[] args) {
        int integer = 21; // 21- 
        System.out.println(ordinalNumber(integer));
    }
}

// 521 // "ST"
// 523 // "RD"
// 522 // "ND"
// 531 // "ST"

// 521 // "521-ST"
// 523 // "523-RD"
// 522 // "522-RD"
// 531 // "531-ST"