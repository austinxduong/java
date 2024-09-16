package LinkedHashMap;

public class BratWurstAlgo {
    public static String bratWurstAlgo(String sentence) {
        String sausage = "Wurst";
        String[] sentenceSplit = sentence.split(" ");

        for(int i = 0; i < sentenceSplit.length; i++) {
            if (sentenceSplit[i].contains(sausage)) {

            }
        }

    }
    public static void main(String[] args) {
        String sentence = "Add the kielbasa and the reserved potatoes and stir through";
        System.out.println(bratWurstAlgo(sentence));
    }
}
