package ET;

public class RecursionFactorial {
    public static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n -1);
        } else {
            return 1;
        }
    }
}
