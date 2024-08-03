package ArrayList;

import java.util.Arrays;
// import java.util.ArrayList;

public class ArrayMultiplier {
    public static Object[][] arrayMultiplier(Object[] items) {

    Integer arrayLength = items.length;
    Object[][] newItems = new Object[arrayLength][arrayLength];

    for (Integer i = 0; i < items.length; i++) {
        for (Integer j = 0; j < items.length; j++) {
            
                newItems[i][j] = items[i];
            }
        }
        return newItems;
    }

    public static void main(String[] args) {
        Object[] items = {"a", 8, "d", 9, "yh"};
        System.out.println(Arrays.deepToString(arrayMultiplier(items)));
    }
}

/*
expected output: 
[["a", "a", "a", "a"], [8, 8, 8, 8], ["d", "d", "d", "d"], ["yh", "yh", "yh", "yh"]]
 */

// {"a", 8, "d", 9, "y"} // [[null, y, null, null, null], [null, null, null, null, null], [null, null, null, null, null], [null, null, null, null, null], [null, null, null, null, null]]


/*
for (Integer i = 0; i < newItems.length; i++) {
    for (Integer j = 0; j < newItems[i].length; j++) {
        newItems[i][j] = 4;
        // [[4, 4, 4, 4, 4], [4, 4, 4, 4, 4], [4, 4, 4, 4, 4], [4, 4, 4, 4, 4], [4, 4, 4, 4, 4]]
    }
}
 */

//  for (Object e : items) {
//     for (Integer i = 0; i < newItems.length; i++) {
//         for (Integer j = 0; j < newItems[i].length; j++) {
//             newItems[i][j] = e;
//             // [[yh, yh, yh, yh, yh], [yh, yh, yh, yh, yh], [yh, yh, yh, yh, yh], [yh, yh, yh, yh, yh], [yh, yh, yh, yh, yh]]
//         }
//     }
// }


//[["a", "a", "a", "a"], [8, 8, 8, 8], ["d", "d", "d", "d"], ["yh", "yh", "yh", "yh"]]