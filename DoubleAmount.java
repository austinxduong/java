public class DoubleAmount {
    public static boolean doubleAmount(int[] cent, double amountDue) {
        double[] arrayD = new double[]{0.25, 0.10, 0.05, 0.01};
        double total = (cent[0] * arrayD[0]) + (cent[1] *  arrayD[1]) + (cent[2] * arrayD[2]) + (cent[3] * arrayD[3]);
        return total > amountDue ? true : false;
    }
    public static void main(String[] args) {
        double amountDue = 13.85;
        int[] cent = {10, 0, 0, 50};
        System.out.println(doubleAmount(cent, amountDue));
    }
}

// false