import java.util.Arrays;

public class HashPlus{
    public static int[] hp(String d) {
        char hash = '#';
        char plus = '+';
        int[] hp = new int[2];
        
        for (int i = 0; i < d.length(); i++) {
            if (d.charAt(i) == hash) {
                hp[0]++;
            } else {
            if (d.charAt(i) == plus) {
                hp[1]++;
                }
            }
        }
        return hp;
    }

    public static void main(String[] args) {
        String d = "#######+++++++#++##++###++";
        System.out.println(Arrays.toString(hp(d)));
    }
}

// [13, 13]