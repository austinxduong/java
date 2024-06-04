
import java.util.HashMap;
import java.util.Map;

public class HashMaps{
    public static void characterCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey()+ ":" + " " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        String str = "Howdy! Je suis Austin. Gruyère cheese is delelectably delightful";
        characterCount(str);
    }
}

/*
A: 1
G: 1
H: 1
J: 1
 : 8
!: 1
a: 1
b: 1
c: 2
d: 3
e: 9
f: 1
g: 1
è: 1
h: 2
i: 4
l: 5
n: 1
.: 1
o: 1
r: 2
s: 5
t: 3
u: 4
w: 1
y: 3
 */