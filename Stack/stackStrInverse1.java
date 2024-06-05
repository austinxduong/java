package Stack;

import java.util.Stack;

public class stackStrInverse1 {
    public static void stackStr(String sr) {
        Stack<String> str = new Stack<String>();

        for (int a = 0; a < sr.length(); a++) {
            str.push("" + sr.charAt(a));
        }

        String stack = "";
        while (!str.empty()) {
            stack += str.pop();
        }
        System.out.println(stack.toUpperCase() + " " + "|" + " " + "is stack empty?:" + " " + stack.isEmpty());
    }

    public static void main(String[] args) {
        String sr = "Feta Chesse Pizza makes a big gooey pizza, Dziękuję\n";  //
                        
        stackStr(sr);
    }
}

// YMMUY SETSAT AZZIP ESSEHC ATEF | is stack empty?: false
