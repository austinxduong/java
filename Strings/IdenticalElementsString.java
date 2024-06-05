package Strings;

public class IdenticalElementsString {
    public static boolean isIdentical(String str) {
        for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(0)) {
				return false;
			}
		}
		return true;
  }
}
// loops through a string, and returns true/false of all elements within the string are identical with a length() method