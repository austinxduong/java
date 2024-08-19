import java.util.Arrays;
import java.util.ArrayList;

public class MaskFourWords {
    public static ArrayList<String> maskFourWords (String words) {
        String[] splitWord = words.split(" ");
        // String[] maskedWord = new String[splitWord.length];
        
        ArrayList<String> maskedArrayList = new ArrayList<String>();
       

        for (Integer i = 0; i < splitWord.length; i++) {
            // for (Integer a = 0; a < splitWord[i].length(); a++) {
                if (splitWord[i].length() > 4) {
                    String masked = splitWord[i].replaceAll("\\w", "*");
                    maskedArrayList.add(masked); //[null, null, null, null********]
                } else {
                    maskedArrayList.add(splitWord[i]); // [The, code, is, ********]
      

                }
            }
        // }
        
        return maskedArrayList; 
        // [null, null, null, null********]
        // expected output: The code is ********
    }

    public static void main(String[] args) {
        String words = "The code is eighteen";
        System.out.print(maskFourWords(words));
    }
}
