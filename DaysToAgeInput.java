
import java.util.Scanner;

public class DaysToAgeInput {
    public static int DaysToAgeInputCompute(int age) {
        int res = 365 * age;
        return res;
    }

public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        int year = scan.nextInt();
        System.out.println("Days:" + " "  + DaysToAgeInputCompute(year));
        }
    }
}
