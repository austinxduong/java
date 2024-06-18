package Regex;

public class Maskify {
    public static String maskifyS(String s) {

        if (s.length() <= 3) {
            return s;

        } else {
            String sx = s.substring(s.length() - 4);
            String l4 = s.substring(0, s.length() - 4);
            String maskify = l4.replaceAll( "\\d|\\w|\\D", "#");
            return maskify + sx;
        }
    }

    public static void main(String[] args) {
        String s = "1234";
        System.out.println(maskifyS(s));
    }
}
// 1234 // 1234
// 12345 // #2345
// 574839374950 // ########4950
// 000-000-000 // #######-000
// 9879803-352435-35635478 // ###################5478