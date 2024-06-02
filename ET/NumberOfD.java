package ET;

public class NumberOfD {
    public static int countDs(String str) {
        
        char d = 'd';
        int total = 0;
        for (int a = 0; a < str.length(); a++) {
            if (str.charAt(a) == d) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String str = "Howdy, days by nights are delightful & dapper, merci de coupe";
        System.out.println("Number of D's:" + " " + countDs(str) );
    }
}
