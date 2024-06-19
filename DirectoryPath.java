public class DirectoryPath {
    public static String DPath(String f) {
		String[] arr = f.split("/");
		
		
			return arr[arr.length - 1];
	}

    public static void main(String[] args) {
        String f = "C:/aus/java/file.pdf";
        System.out.println(DPath(f));
    }
}

//C:/aus/java/file.pdf // file.pdf
