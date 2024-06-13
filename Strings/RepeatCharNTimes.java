package Strings;

public class RepeatCharNTimes {
    public static String charN(String str, int n) {
        String strp = "";

        for(char key : str.toCharArray()) {
            for (int a = 0; a < n; a++) {
                strp += key;
            }
        }
        return strp;
    }

    

    public static void main(String[] args) {
        String str = "Gourmet Cheese";
        int n = 5;

        System.out.println(charN(str, n));
    }
}

// GGGGGooooouuuuurrrrrmmmmmeeeeettttt     CCCCChhhhheeeeeeeeeessssseeeee