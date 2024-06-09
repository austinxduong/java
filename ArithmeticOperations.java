public class ArithmeticOperations {
    public static int operate(int num1, int num2, String operator) {
        int total = 0;
        if (operator == "+"){
            return num1 + num2;
        } else {
        if (operator == "-") {
            return num1 - num2;
        } else {
        if (operator == "*") {
            return num1 * num2;
        } else {
        if (operator == "/") {
            return num1 / num2;
        } else {
        if (operator == "%") {
            return num1 % num2;
                        }
                    }
                }
            }
        }
        return total;
    }

public static void main(String[] args) {
    int num1 = 100;
    int num2 = 21;
    String operator = "%";

    System.out.println("Total ="+ " " + operate(num1, num2, operator));
    }
}

// Total = 16

