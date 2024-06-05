package Stack;
import java.util.Stack;

public class stackStrInverse {
    public static void stackStr(String sr) {
        Stack<String> str = new Stack<String>();

        for (int a = 0; a < sr.length(); a++) {
            str.push("" + sr.charAt(a));
        }

        String stack = "";
        while (str.empty() == false) {
            stack += str.pop(); 
            }
            System.out.println(stack.toUpperCase() + " " + "|" + " " + "is stack empty?:" + " " + stack.isEmpty());
        }

    public static void main(String[] args) {
        String strCheese = "Cheddar Mozzarella";
        stackStr(strCheese);
        } 
}

/*
A
AL
ALL
ALLE
ALLER
ALLERA
ALLERAZ
ALLERAZZ
ALLERAZZO
ALLERAZZOM
ALLERAZZOM 
ALLERAZZOM R
ALLERAZZOM RA
ALLERAZZOM RAD
ALLERAZZOM RADD
ALLERAZZOM RADDE
ALLERAZZOM RADDEH
ALLERAZZOM RADDEHC
 */
