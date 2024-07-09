package Arrays;



public class MultidimensionalArray {
        public static int alphabetCounter(char[][] arr, char c) {
        int total = 0;
        String charArray = "";

        for (int d = 0; d < arr.length; d++) {
            for (int e = 0; e < arr[d].length; e++) { 
                charArray += arr[d][e];
                }
            }
        for(int i = 0; i < charArray.length(); i++) {
            if (charArray.charAt(i) == c) {
                total++;
                }
            }
            return total;
    }

    public static void main(String[] args) {
        char[][] arr = { {'A', 'D', 'D', 'D'}, {'D', 'D', 'F', 'G'} };
        char c = 'D';
        System.out.println(alphabetCounter(arr, c));
    }
}

// { {'A', 'B', 'C', 'D'}, {'D', 'E', 'F', 'G'} } // 2
// { {'A', 'B', 'C', 'D'}, {'D', 'D', 'F', 'G'} } // 3
// { {'A', 'D', 'C', 'D'}, {'D', 'D', 'F', 'G'} } // 4
// { {'A', 'D', 'D', 'D'}, {'D', 'D', 'F', 'G'} } // 5

