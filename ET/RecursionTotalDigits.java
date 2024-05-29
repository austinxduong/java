package ET;

public class RecursionTotalDigits {
    public static int sum(int n) {
        if (n > 1) {
            return n + sum(n -1);
        } else {
            return 1;
        }
    }
}
