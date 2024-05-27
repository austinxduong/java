import java.util.Scanner;

public class MonthsOfYear {
    public static String Months(int n) {
        String[] array = {
		    "January",
			"February",
			"March",
			"April",
			"May",
			"June",
			"July",
			"August",
			"September",
			"October",
			"November",
			"December",
        };
        return array[n - 1]; 
    }

    public static void main(String[] args) {
       try (Scanner scan = new Scanner(System.in)) {
         int monthNumber = scan.nextInt();
         System.out.println("Month:" + "" + " " + Months(monthNumber));

       }
    }
}
