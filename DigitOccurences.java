

public class DigitOccurences {
    public static int dOccurences(int min, int max, int digit) {

    Integer total = 0;
    
    for (int i = min; i <= max; i++) {

        Integer dg = String.valueOf(i).length() - String.valueOf(i).replaceAll("" +digit, "").length();

        total += dg;

        }
        return total;

    }

    public static void main(String[] args) {
        int min = 20;
        int max = 25;
        int digit = 2;

        System.out.println(dOccurences(min, max, digit));
    }
}

// 7