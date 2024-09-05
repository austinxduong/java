

public class IndexFilteringString {
    public static String indexFilteringString(String words, int[] indexes) {

        String wordsLowerCase = words.toLowerCase();
        String filteredWordsIndex = "";

        for (int a : indexes) {
            filteredWordsIndex += wordsLowerCase.charAt(a + (a < 0 ? words.length() : 0 ));
        }

        return filteredWordsIndex; 
    }

    public static void main(String[] args) {
        String words = "Relax and stay calm to avoid failures"; // 34 letters
        int[] indexes = {4, -7, -13, -11, -2, 0};
        System.out.println(indexFilteringString(words, indexes));

    }
}




