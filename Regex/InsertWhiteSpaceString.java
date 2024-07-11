package Regex;

public class InsertWhiteSpaceString {
    public static String isw(String s) {
        return s.replaceAll("(\\w)([A-Z])", "$1 $2");
    }

    public static void main(String[] args) {
        String s = "PartyCityPortlandSpaceToEarthEarthToSpace";
        System.out.println(isw(s));
    }
}


//"PartyCityPortlandSpaceToEarthEarthToSpace" // Party City Portland Space To Earth Earth To Space
