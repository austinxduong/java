package ArrayList;

import java.util.ArrayList;

public class MaskFourWords {
    public static String maskFourWords (String words) {
        String[] splitWord = words.split(" ");
    
        
        ArrayList<String> maskedArrayList = new ArrayList<String>();
       

        for (Integer i = 0; i < splitWord.length; i++) {
            if (splitWord[i].length() > 4) {
                String masked = splitWord[i].replaceAll("\\w", "*");
                maskedArrayList.add(masked); // [********]
            } else {
                maskedArrayList.add(splitWord[i]); // [The, code, is, ********]
            }
        }
        String maskedArrayListString = String.join(" ", maskedArrayList);
        
        return maskedArrayListString; 

    }

    public static void main(String[] args) {
        String words = "eighteen, nineteen, twenty, twenty-one";
        System.out.print(maskFourWords(words));
    }
}

// The code is eighteen // The code is ********
// Its summer in August, and its almost fall season september // Its ****** in ******, and its ****** fall ****** *********
// eighteen, nineteen, twenty, twenty-one // ********, ********, ******, ******-***