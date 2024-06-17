package Regex;

public class Maskify {
    public static String maskifyS(String s) {
		String sx = s.substring(s.length() - 4);
		String l4 = s.substring(0, s.length() - 4);
		String maskify = l4.replaceAll( "\\d|\\w|\\D", "#");
		
		return maskify + sx;
    }

    public static void main(String[] args) {
        String s = "9879803-352435-35635478";
        System.out.println(maskifyS(s));
    }
}

// 574839374950 // ########4950
// 000-000-000 // #######-000
// 9879803-352435-35635478 // ###################5478