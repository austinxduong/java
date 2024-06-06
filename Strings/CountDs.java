package Strings;

public class CountDs {
    public static int CountDStr(String str) {
        int ds = 0;
        char[] charArray = str.toCharArray();
        for (int a = 0; a < charArray.length; a++) {
            if (charArray[a] == 'D' | charArray[a] == 'd') {
                ds++;
            }
        }
        return ds;
    }

    public static void main(String[] args) {
        String str = "Greek dudes are fun, plentiful, and radically delightful";
        System.out.println("Number of D's:" + " " + CountDStr(str));
    }
}
// Number of D's: 5