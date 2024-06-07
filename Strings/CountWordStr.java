package Strings;

public class CountWordStr {
    public static int strCount(String s) {
        String[] wordStrings = s.split("\\s+");
        return wordStrings.length;
    }

    public static void main(String[] args) {
        String s = "Woah it's almost Summer! & that means more fun times and moments, yay!;)";
        System.out.println("Word Count Total:" + " " + strCount(s));
    }
}
