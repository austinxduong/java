package ArrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayMultiplier {
    public static Object[][] arrayMultiplier(Object[] items) {

        ArrayList<Object> itemsArrayList = new ArrayList<Object>();

        // Integer arrayLength = items.length;
        // Object[][] newItems = new Object[1][arrayLength];

    //     for (Object e : items) {
    //         newItems[0][1] = e * arrayLength; 
    //     }
    //     return newItems;
    
    }

    public static void main(String[] args) {
        Object[] items = {"a", 8, "d", 9, "y"};
        System.out.println(Arrays.deepToString(arrayMultiplier(items)));
    }
}
