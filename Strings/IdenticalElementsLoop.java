package ET;

public class IdenticalElementsLoop{
    public static boolean Elements(String[] result){
        for (int i = 1; i < result.length; i++){
            if (result[i].compareTo(result[0]) != 0){
                return false;
            }
        }
        return true;
    }
}
// prints a true/false value whether all elements within the string array are identical

