package Strings;

public class StringJoins {
    public static String joins(String l, String r) {
        String glu = l + r;
        String c = glu.substring(0,1).toUpperCase();
        String dx = glu.substring(1);
        
        return c + dx;
    }

    public static void main(String[] args) {
        String l = "comp";
        String r = "iler";
        System.out.println(joins(l, r));
    }
}

// "seas", "onal" // Seasonal
// "comp", "plete" // Complete
// "java", "script" / Javascript
// "jav", "a" // Java
// "comp", "iler" // Compiler
