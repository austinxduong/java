package HashMap;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;


public class HashToArray {
    	public static String[] getValues(Map<String,String> dic) {
		String[] array = dic.values().toArray(new String[0]);
		String str = "";
        String[] arr = str.split("\\,");
		
		for (String value : array) {
			str += value + ",";
		}
		return arr;
	}

    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();
        dic.put("a", "Apple");
        dic.put("b", "Microsoft");
        dic.put("c", "Google");

        System.out.println(Arrays.toString((getValues(dic))));
    }
}
