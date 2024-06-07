package Strings;

public class RepeatStr{
    public static String repeatStr(Object d, int m) {
        String count = "";

        if (d instanceof String) {
            for (int i = 0 ; i < m; i++) {
                count += d;
            }
            return count;
        } else {
           return "The instance of this object must be a string";
        }
    }

    public static void main(String[] args){
        Object d = "amazon";
        int m = 3;
        System.out.println(repeatStr(d, m));
    }
}
