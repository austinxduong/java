package Regex;

public class AlphabetExtract {
    public static String alphExtract(String s) {
        return s.replaceAll("\\W|\\d|\\_", "");
    }

    public static void main(String[] args) {
        String s = "--a<!#h)(o:;t%t$()~y%@";
        System.out.println(alphExtract(s));
    }
}

// "*.[[]-_t.2++w..i&^%n(((_k#*i#$$$e%@_+==s.^&#" // twinkies
//&*&s--p..9%-#^!-;i))n(a[c]h** d^^i$/p8 // spinachdip
// $-r((a3#::;d^^- // rad
// @i~%8$;',$t(s%l&&i(()t`+=: // itslit
// --a<!#h)(o:;t%t$()~y%@ // ahotty