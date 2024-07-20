public class IntegerComparisonOperator {
    public static Integer integerComOperator(Integer digit) {
        Integer total = 0;

        if (digit == 0) {
            total++;
        }
        return total;
    }

    public static void main(String[] args) {
        Integer digit = 5;
        System.out.println(integerComOperator(digit));
    }
}



