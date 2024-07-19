package Regex;

public class SpecOccurences {
    public static String dg(String strd, String digit) {

    String dRx = strd.replaceAll("" +digit, "");

    return dRx;

    }

    public static void main(String[] args){

        String strd = "155533 1833333 1533";

        String digit = "3";

        System.out.println(dg(strd, digit));
    }
}

// 5553 555 555 // 555 555 555
// 5553 5553 555 // 555 555 555
// 5553 5553 5553 // 555 555 555
// 55533 5553 5553 // 555 555 555
// 55533 5553 55533 // 555 555 555
// 55533 55533333 55533 // 555 555 555
// 155533 1855533333 55533 //  1555 18555 555
// 155533 1833333 1533 // 

