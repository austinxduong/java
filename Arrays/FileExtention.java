package Arrays;

import java.util.Arrays;

public class FileExtention {
    public static String[] extention(String[] arr) {
        String[] ar = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
            ar[i] = arr[i].substring(arr[i].indexOf("."));
            }

		return ar;
    }

    public static void main(String[] args) {
        String[] arr = {"java.jpg", "picture.jpeg", "app.pdf"};
        System.out.println(Arrays.toString(extention(arr)));
    }
}
