public class IntegerIncrementDivide {
    public static String integerIncrementD(int min, int max, int digit) {

        String modArray  = "";

        for (int i = min; i <= max; i++) {
             
            modArray += i/10 + " ";
        }
        return modArray;
    }
    public static void main(String[] args) {

    int min = 80;
    int max = 86;
    int digit = 5;

    System.out.println(integerIncrementD(min, max, digit));
    }
}

// 8 8 8 8 8 8 8
// 501 501 501 501 501 501
// 101 101 101 101 102 102 102 102 102 102 102 102 102 102 103 103 103 103 103 103 103 103 103 103 104 104 104 104 104 104 104 
