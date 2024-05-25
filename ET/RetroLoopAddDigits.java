package ET;

public class RetroLoopAddDigits {
    public static int addDigits(int n) {
        int total = 0;
        for (int i = 0; i < n; i = i + 1) {
            total += i;
        }
        return total + n;
    }
}
