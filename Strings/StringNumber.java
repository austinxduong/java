package Strings;

public class StringNumber{
    public static int toInteger(String str) { // computes a string to an integer,                                     // and this particular method with throw a NumberFormatException
        return Integer.parseInt(str);
    }

    public static String toString(int num){ // computes an integer to a string
        return String.valueOf(num);
    }
}

