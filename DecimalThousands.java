import java.text.NumberFormat;

public class DecimalThousands {
    public static String formattingD(int n) {
        NumberFormat formattingDec = NumberFormat.getInstance();
        formattingDec.setGroupingUsed(true);

        return formattingDec.format(n);
    }

    public static void main(String[] args) {
        int n = 10000;
        System.out.println(formattingD(n));
    }
}

// 1000000000 // 1,000,000,000
// 100000 // 100,000
// 10000000 // 10,000,000
// 1000 // 10,000
